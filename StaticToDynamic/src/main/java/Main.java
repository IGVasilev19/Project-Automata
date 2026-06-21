import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Path inFile = Path.of("inputC");
        Path outFile = Path.of("outputPython");

        String source = Files.readString(inFile);

        StaticToDynamicLexer lexer =
                new StaticToDynamicLexer(CharStreams.fromString(source));
        StaticToDynamicParser parser =
                new StaticToDynamicParser(new CommonTokenStream(lexer));

        String python = new MyVisitor().visit(parser.start());

        Files.writeString(outFile, python);

        printReport(inFile, outFile, source, python);
        runPython(outFile);
    }

    private static void runPython(Path outFile) {
        System.out.println();
        System.out.println("  Program output (executed Python)");
        System.out.println("  " + "-".repeat(68));

        for (String interp : List.of("python", "py", "python3")) {
            try {
                Process p = new ProcessBuilder(interp, outFile.toString())
                        .redirectErrorStream(true)
                        .start();
                String out = new String(p.getInputStream().readAllBytes());
                int code = p.waitFor();
                printIndented(out.isEmpty() ? "(no output)" : out);
                if (code != 0) {
                    System.out.println("    [exit code " + code + "]");
                }
                System.out.println("=".repeat(72));
                return;
            } catch (IOException ignored) {
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
        System.out.println("    Could not find a Python interpreter on PATH.");
        System.out.println("=".repeat(72));
    }

    private static void printReport(Path inFile, Path outFile,
                                    String source, String python) {
        String line = "=".repeat(72);
        System.out.println(line);
        System.out.println("  Static -> Dynamic translation   (" + inFile + " -> " + outFile + ")");
        System.out.println(line);

        System.out.println();
        System.out.println("  C source");
        System.out.println("  " + "-".repeat(68));
        printIndented(source);

        System.out.println();
        System.out.println("  Python output");
        System.out.println("  " + "-".repeat(68));
        printIndented(python);

        System.out.println(line);
    }

    private static void printIndented(String text) {
        String[] lines = text.split("\n", -1);
        int n = 1;
        for (String l : lines) {
            if (l.isEmpty() && n == lines.length) break;
            System.out.printf("    %3d | %s%n", n++, l);
        }
    }
}
