import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.gui.Trees;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    //S'inspirer de l'anneé passé et de ce que terrence a écris dans son livre

    public static void main( String[] args ) throws IOException {
        TinyLexer lexer = new TinyLexer(CharStreams.fromFileName("./src/test/test0.txt"));
        TinyParser parser = new TinyParser(new CommonTokenStream(lexer));

        TSGenerator tsGenerator = new TSGenerator();
        QuadGenerator quadGenerator = new QuadGenerator(tsGenerator.ts);

        parser.addParseListener(tsGenerator);
        parser.addParseListener(quadGenerator);

        parser.start();

         ObjCodeGenerator OCgenerator = new ObjCodeGenerator(quadGenerator);
        OCgenerator.createCode();

        //tsGenerator.printTS();
        //quadGenerator.printQuads();
        OCgenerator.afficherCode();


}


}

