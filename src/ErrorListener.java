import org.antlr.v4.runtime.*;

import java.util.Collections;
import java.util.List;

public class ErrorListener extends BaseErrorListener {

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e)
    {
        System.err.println("ligne "+line+": colonne "+charPositionInLine+" "+msg);
        UnderLineError(recognizer, (Token)offendingSymbol, line, charPositionInLine);

    }

    protected void UnderLineError(Recognizer recognizer,Token offendingToken,int line,int charPositionInLine){
        CommonTokenStream tokens = null;
        try {
            tokens=(CommonTokenStream) recognizer.getInputStream();
            String input=tokens.getTokenSource().getInputStream().toString();
            String lines[]=input.split("\n");
            String errorLine=lines[line-1];
            System.out.println(errorLine);
            for(int i=0;i<charPositionInLine;++i)   System.err.print(" ");
            int start=offendingToken.getStartIndex();
            int stop=offendingToken.getStopIndex();
            if(start>=0&&stop>=0)
                for(int i=start;i<=stop;++i)
                    System.err.print("^");
        }catch (Exception e){
            System.err.println();
        }
    }

}