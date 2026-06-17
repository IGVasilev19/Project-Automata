import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        Path inFile = Path.of("inputC");
        Path outFile = Path.of("outputPython");

        StaticToDynamicLexer lexer =
                new StaticToDynamicLexer(CharStreams.fromPath(inFile));
        StaticToDynamicParser parser =
                new StaticToDynamicParser(new CommonTokenStream(lexer));

        String python = new MyVisitor().visit(parser.start());

        Files.writeString(outFile, python);

        System.out.println("Translated " + inFile + " -> " + outFile);
        System.out.println(python);
    }
}
