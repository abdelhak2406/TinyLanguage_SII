
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    //S'inspirer de l'anneé passé et de ce que terrence a écris dans son livre

    public static void main( String[] args )
    {   
        //TODO: a partir d'un fichier
        CharStream inputStream = CharStreams.fromString(
                "I would like to [b][i]emphasize[/i][/b] this and [u]underline [b]that[/b][/u] ." +
                        "Let's not forget to quote: [quote author="John"]You're wrong![/quote]");
        //TODO:changer cette partie!! 
        MarkupLexer markupLexer = new MarkupLexer(inputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(markupLexer);
        MarkupParser markupParser = new MarkupParser(commonTokenStream);

        MarkupParser.FileContext fileContext = markupParser.file();
        MarkupVisitor visitor = new MarkupVisitor();
        visitor.visit(fileContext);
    }

}
