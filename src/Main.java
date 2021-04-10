import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.gui.Trees;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Main {
    //S'inspirer de l'anneé passé et de ce que terrence a écris dans son livre

    public static void main( String[] args ) throws FileNotFoundException {
        String inputFile=null;
        if(args.length>0){

            inputFile=args[0];
        }
        InputStream is=System.in;
        if(inputFile!=null)
        {
            is=new FileInputStream(inputFile);
        }
        /*inputFile = "src/test/resources/test1.txt";
        InputStream is = new FileInputStream(inputFile);*/
        CharStream input=new UnbufferedCharStream(is);

        TinyLexer lex =new TinyLexer(input);
        lex.removeErrorListeners();
        lex.addErrorListener(new ErrorListener());

        lex.setTokenFactory(new CommonTokenFactory(true));

        TokenStream tokens = new UnbufferedTokenStream<CommonToken>(lex);
        TinyParser parser=new TinyParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new ErrorListener());
        //parser.removeErrorListeners();
        ParseTree tree = parser.start();

        Trees.inspect(tree,parser);
        ParseTreeWalker walker = new ParseTreeWalker();
        TsListener lis = new TsListener();
        walker.walk(lis,tree);

        /*
        walker.walk(new TsListener(),tree);
        walker.walk(new QuadListener(),tree);
        */
    }


}

