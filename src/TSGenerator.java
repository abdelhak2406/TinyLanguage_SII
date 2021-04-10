import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.tool.Rule;

import javax.lang.model.util.Types;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/*
    la classe qui contient toutes les methodes a appliquer sur
    les non terminales afin de remplir la table des symbloe
    et On vas generer les erreurs semantique (ROUTINES !!! )
 */
public class TSGenerator extends  TinyParserBaseListener{
    String ANSI_RED = "\u001B[31m";
    String ANSI_BLACK = "\u001B[30m";
    String ANSI_RESET = "\u001B[0m";
    String ANSI_CYAN = "\u001B[36m";
    String ANSI_GREEN = "\u001B[32m";
    public TableSymbole ts = new TableSymbole();
    public LinkedList<String> tabErrors;
    public Boolean opIsCorrect;
    Stack pileExpression = new  Stack<Types>();

    public void printTs(){
        ts.printTs();
    }
    public void printErrors() {

        if (this.tabErrors.size() > 0)
        {
            System.out.println(ANSI_RED + "\n\n\n***** \t ERRORS \t *****" + ANSI_RED + ANSI_RESET);
            for (String err : this.tabErrors)
            {
                System.out.println("- " + err);
            }
        }
    }
    @Override public void enterStart(TinyParser.StartContext ctx) {
        /*
            nous allons creer un tableau afin de referencer toutes les erruers;

         */
        tabErrors = new LinkedList<String>();

    }

    @Override public void exitStart(TinyParser.StartContext ctx) {
        System.out.println("nous sommes a la fin");

        if (this.tabErrors.size()> 0){
            System.out.println(ANSI_RED+"\n\n\n***** \t ERRORS \t *****"+ANSI_RED+ANSI_RESET);
            for (String err:this.tabErrors)
            {
                System.out.println("- "+err);
            }
        }else {
            //afficher la ts
            System.out.println("la table des symbole:\n");
            ts.printTs();
        }
    }

    @Override public void exitVarDec(TinyParser.VarDecContext ctx) {
        //TODO: eventuellement ajouter la ligne dans laquelle il y'a l'erreur

        int type = 0,len;
        Boolean errorOrNot;
        String toAdd = new String();


        List<ParseTree> declarations = ctx.children;
        len = declarations.toArray().length;
        int i=0;
        while( i < len) {
            String tmp = declarations.get(i).getText();

             if (tmp.equals("intCompil") || tmp.equals("floatCompil") || tmp.equals("StringCompil")) {
                 if (tmp.equals("intCompil")) {
                     type = 1;// entier
                 } else if (tmp.equals("floatCompil")) {
                     type = 2;//float
                 } else if (tmp.equals("StringCompil"))
                     type = 3; //String
                 i++;
                 tmp = declarations.get(i).getText();
                 while (!tmp.equals(";")) {

                     String[] idfs  = tmp.split(",");
                     for (int j = 0; j < idfs.length; j++) {
                         //la techniquement nous sommes dans les variables du type donc on vas remplir la
                         // TS
                         errorOrNot = ts.addElement(idfs[j], type, "0", true);
                         if(errorOrNot){
                             toAdd = "Variable "+ANSI_CYAN+idfs[j]+ANSI_RESET+"  precedament initialiser";
                             this.tabErrors.add(toAdd);
                         }
                     }

                     i++;
                     tmp = declarations.get(i).getText();

                 }
                 i++;
             }else {
                 /*
                    Normallement sa voudrait dire qu'il y'a une erreur dans le mot cle.
                    normallement il ne rentrera jamais ici,
                    j'ai essyer de changer le mot cle il detecte une erreur
                    et n'execute meme pas sa
                  */
                 System.out.println("erreur mot cle "+tmp+ " Incorrecte");
             }
        }


    }


    @Override public void enterAff(TinyParser.AffContext ctx) {
        this.pileExpression.clear();
        this.opIsCorrect = true;//on suppose que l'operation est correcte

    }
    @Override public void exitAff(TinyParser.AffContext ctx) {
        TerminalNode idfctx = ctx.IDENTIFIER();
        //TODO :verifier qu'il est declarer:
        if (idfctx != null) {

            String idf = ctx.IDENTIFIER().getText();
            System.out.println("idf dans exitAff: " + idf);
            if (ts.lookup(idf) == null) {
                String errorMessage = "Variable " + ANSI_CYAN + " " + idf + "" + ANSI_RESET + " Non Declare ligne:  " + ANSI_GREEN + ctx.start.getLine() + ANSI_RESET;
                this.tabErrors.add(errorMessage);

            } else {
                if (ctx.IDENTIFIER() != null) {
                    String exp = ctx.IDENTIFIER().getText();

                    if (ts.lookup(exp) == null) {
                        String errorMessage = "Variable " + ANSI_CYAN + " " + idf + "" + ANSI_RESET + " Non Declare ligne:  " + ANSI_GREEN + ctx.start.getLine() + ANSI_RESET;
                        this.tabErrors.add(errorMessage);
                    } else {
                        if (opIsCorrect) {
                            if ((ts.lookup(idf).getType() == Types_Tiny.INTEGER) && (!this.pileExpression.empty()) && (this.pileExpression.peek() == Types_Tiny.FLOAT)) {
                                String errorMessage = "Incompatibilité des types: idf " + ANSI_CYAN + idf + ANSI_RESET + " de type " + ts.lookup(idf).getType() +
                                        " recoit une expression de type " + this.pileExpression.peek() + " ligne:  " + ANSI_GREEN + ctx.start.getLine() + ANSI_RESET;
                                this.tabErrors.add(errorMessage);
                            }
                        }
                    }
                }
            }
        }
    }




    @Override public void exitArith_mult(TinyParser.Arith_multContext ctx) {
        TinyParser.OperandeContext oper = ctx.operande();

        if (oper != null) {
            TsElement elem = ts.lookup(oper.getText());
            System.out.println("enterArith_mult: "+oper.getText());
            if (elem == null) {

                 if(! ((ctx.operande().INTEGER()!= null )|| (ctx.operande().FLOAT()) != null)){
                String errorMessage = "Variable " + ANSI_CYAN + oper.getText() + ANSI_RESET + " Non Declare ligne:  " + ANSI_GREEN + ctx.start.getLine() + ANSI_RESET;
                this.tabErrors.add(errorMessage);
                this.opIsCorrect=false;
                }
            } else {
                //ajouter a la pile pour connaitre le type
                Types_Tiny type, exType;
                type = elem.getType();
                if (pileExpression.isEmpty()) {
                    pileExpression.push(type);
                } else {
                    exType = (Types_Tiny) pileExpression.pop();
                    if (exType == type) {
                        pileExpression.push(type);
                    }else if(exType == Types_Tiny.FLOAT){
                        //l'actuelle peut etre un int on s'en fou
                        pileExpression.push(exType) ;
                        }else
                            {
                                pileExpression.push(type);
                            }
                    }
                }
            }

    }


    @Override public void exitArith_div(TinyParser.Arith_divContext ctx) {
        TinyParser.OperandeContext oper = ctx.operande();

        if (oper != null) {
            TsElement elem = ts.lookup(oper.getText());
            System.out.println("enterArith_mult: "+oper.getText());
            if (elem == null) {

                 if(! ((ctx.operande().INTEGER()!= null )|| (ctx.operande().FLOAT()) != null)){
                String errorMessage = "Variable " + ANSI_CYAN + oper.getText() + ANSI_RESET + " Non Declare ligne:  " + ANSI_GREEN + ctx.start.getLine() + ANSI_RESET;
                this.tabErrors.add(errorMessage);
                this.opIsCorrect=false;
                 }
            } else {
                //ajouter a la pile pour connaitre le type
                Types_Tiny type, exType;
                type = elem.getType();
                if (pileExpression.isEmpty()) {
                    pileExpression.push(type);
                } else {
                    exType = (Types_Tiny) pileExpression.pop();
                    if (exType == type) {
                        pileExpression.push(type);
                    }else if(exType == Types_Tiny.FLOAT){
                        //l'actuelle peut etre un int on s'en fou
                        pileExpression.push(exType) ;
                    }else
                    {
                        pileExpression.push(type);
                    }
                }
            }
        }
    }


    @Override public void exitArith_add(TinyParser.Arith_addContext ctx) {
        TinyParser.OperandeContext oper = ctx.operande();

        if (oper != null) {
            TsElement elem = ts.lookup(oper.getText());
            System.out.println("enterArith_mult: "+oper.getText());
            if (elem == null) {
                if(! ((ctx.operande().INTEGER()!= null )|| (ctx.operande().FLOAT()) != null))
                {
                String errorMessage = "Variable " + ANSI_CYAN +oper.getText()+ ANSI_RESET + " Non Declare ligne:  " + ANSI_GREEN + ctx.start.getLine() + ANSI_RESET;
                this.tabErrors.add(errorMessage);
                this.opIsCorrect=false;
                }
            } else {
                //ajouter a la pile pour connaitre le type
                Types_Tiny type, exType;
                type = elem.getType();
                if (pileExpression.isEmpty()) {
                    pileExpression.push(type);
                } else {
                    exType = (Types_Tiny) pileExpression.pop();
                    if (exType == type) {
                        pileExpression.push(type);
                    }else if(exType == Types_Tiny.FLOAT){
                        //l'actuelle peut etre un int on s'en fou
                        pileExpression.push(exType) ;
                    }else
                    {
                        pileExpression.push(type);
                    }
                }
            }
        }

    }


    @Override public void exitArith_sub(TinyParser.Arith_subContext ctx) {
        TinyParser.OperandeContext oper = ctx.operande();

        if (oper != null) {
            TsElement elem = ts.lookup(oper.getText());
            System.out.println("enterArith_mult: " + oper.getText());
            if (elem == null) {
                if(! ((ctx.operande().INTEGER()!= null )|| (ctx.operande().FLOAT()) != null))
                {    
                String errorMessage = "Variable " + ANSI_CYAN + oper.getText() + ANSI_RESET + " Non Declare ligne:  " + ANSI_GREEN + ctx.start.getLine() + ANSI_RESET;
                this.tabErrors.add(errorMessage);
                this.opIsCorrect = false;
                }
            } else {
                //ajouter a la pile pour connaitre le type
                Types_Tiny type, exType;
                type = elem.getType();
                if (pileExpression.isEmpty()) {
                    pileExpression.push(type);
                } else {
                    exType = (Types_Tiny) pileExpression.pop();
                    if (exType == type) {
                        pileExpression.push(type);
                    } else if (exType == Types_Tiny.FLOAT) {
                        //l'actuelle peut etre un int on s'en fou
                        pileExpression.push(exType);
                    } else {
                        pileExpression.push(type);
                    }
                }
            }
        }

        }
    @Override public void enterOper(TinyParser.OperContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitOper(TinyParser.OperContext ctx) {
        TinyParser.OperandeContext oper = ctx.operande();

        if (oper != null) {
            TsElement elem = ts.lookup(oper.getText());
            System.out.println("enterArith_mult: " + oper.getText());
            if (elem == null) {
                 if(! ((ctx.operande().INTEGER()!= null )|| (ctx.operande().FLOAT()) != null)){
                String errorMessage = "Variable " + ANSI_CYAN + oper.getText() + ANSI_RESET + " Non Declare ligne:  " + ANSI_GREEN + ctx.start.getLine() + ANSI_RESET;
                this.tabErrors.add(errorMessage);
                this.opIsCorrect = false;
                 }
            } else {
                //ajouter a la pile pour connaitre le type
                Types_Tiny type, exType;
                type = elem.getType();
                if (pileExpression.isEmpty()) {
                    pileExpression.push(type);
                } else {
                    exType = (Types_Tiny) pileExpression.pop();
                    if (exType == type) {
                        pileExpression.push(type);
                    } else if (exType == Types_Tiny.FLOAT) {
                        //l'actuelle peut etre un int on s'en fou
                        pileExpression.push(exType);
                    } else {
                        pileExpression.push(type);
                    }
                }
            }
        }


    }





    }


