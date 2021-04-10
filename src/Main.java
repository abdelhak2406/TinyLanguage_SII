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

        TSGenerator tsGenerator = new TSGenerator();//il vas generer la ts
         QuadGenerator quadGenerator = new QuadGenerator(tsGenerator.ts);//le contenu de la ts vas etre utiliser dans les quadruplets!

        //il vas parcourir 2 fois
        // TODO: voir si il n'y a pas d'erreur de synchronisation
        parser.addParseListener(tsGenerator);
        parser.addParseListener(quadGenerator);

        parser.start();

        //ObjCodeGenerator OCgenerator = new ObjCodeGenerator(quadGenerator);
        //OCgenerator.createCode();

        //tsGenerator.printTS();
        //tsGenerator.printErrors() ;
        //quadGenerator.printQuads();
        //OCgenerator.afficherCode();


}
    public static void print_color(String s){
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_RESET = "\u001B[0m";

        System.out.println(ANSI_RED + s.toUpperCase() + ANSI_RESET);
    }

}

