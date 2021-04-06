package me.abdelhakHind.TinySii;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Main {
    //S'inspirer de l'anneé passé et de ce que terrence a écris dans son livre

    public static void main( String[] args ) throws FileNotFoundException {  String inputFile=null;
       /* if(args.length>0){

            inputFile=args[3];
        }
        InputStream is=System.in;
        if(inputFile!=null)
        {
            is=new FileInputStream(inputFile);
        }*/
        inputFile = "src/test/resources/test1.txt";
        InputStream is = new FileInputStream(inputFile);
        CharStream input=new UnbufferedCharStream(is);
        me.abdelhakHind.TinySii.TinyLexer lex =new me.abdelhakHind.TinySii.TinyLexer(input);
        lex.setTokenFactory(new CommonTokenFactory(true));
        TokenStream tokens = new UnbufferedTokenStream<CommonToken>(lex);
        me.abdelhakHind.TinySii.TinyParser parser=new me.abdelhakHind.TinySii.TinyParser(tokens);

        //parser.removeErrorListeners();
        ParseTree tree = parser.start();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new TsListener(),tree);
        walker.walk(new QuadListener(),
                tree);
    }


    }

