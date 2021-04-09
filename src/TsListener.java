import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.tool.Rule;

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
public class TsListener extends  TinyParserBaseListener{
    String ANSI_RED = "\u001B[31m";
    String ANSI_BLACK = "\u001B[30m";
    String ANSI_RESET = "\u001B[0m";
    String ANSI_CYAN = "\u001B[36m";
    String ANSI_GREEN = "\u001B[32m";
    public TableSymbole ts = new TableSymbole();
    public LinkedList<String> tabErrors;
    Stack pileExpression = new  Stack<Types>();


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




    @Override public void enterVarDec(TinyParser.VarDecContext ctx) { }

    @Override public void exitVarDec(TinyParser.VarDecContext ctx) {
        //TODO: eventuellement ajouter la ligne dans laquelle il y'a l'erreur

        int type = 0,len;
        Boolean errorOrNot;
        String toAdd = new String();

        /*
        * ** CE SONT DES TRUC QUE JAI EXECUTER POUR TESTER ** *
        List<TinyParser.TypeDecContext> typ = ctx.typeDec();
        List<TinyParser.ListeDecContext> var = ctx.listeDec();
        int len = typ.toArray().length;
        for (int i = 0; i < len; i++) {
            String tmp = typ.get(i).getText();
            System.out.println(typ.get(i).getText());

        }
        len = var.toArray().length;
        System.out.println("la var var");
        for (int i = 0; i < len; i++) {
            String tmp = var.get(i).getText();
            System.out.println(var.get(i).getText());
        }*/
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


    @Override public void enterListeDec(TinyParser.ListeDecContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitListeDec(TinyParser.ListeDecContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterTypeDec(TinyParser.TypeDecContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitTypeDec(TinyParser.TypeDecContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterDescPgm(TinyParser.DescPgmContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitDescPgm(TinyParser.DescPgmContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterOperande(TinyParser.OperandeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitOperande(TinyParser.OperandeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterAff(TinyParser.AffContext ctx) {
        this.pileExpression.clear();

    }
    @Override public void exitAff(TinyParser.AffContext ctx) {
        String idf = ctx.IDENTIFIER().getText();
        //TODO :verifier qu'il est declarer:
        if (ts.lookup(idf) == null){
             String errorMessage = "Variable "+ANSI_CYAN+idf+ANSI_RESET+" Non Declare ligne:  "+ANSI_GREEN+ctx.start.getLine()+ANSI_RESET;
             this.tabErrors.add(errorMessage);
             ctx.start.getLine();
        }else{
            //TODO: affecter la valeur de l'expression et la mettre dans la TS
        }

        LinkedList<String> liste_op = new LinkedList<String>();


        //TODO: il faut comparer l'identifier avec le type de l'expression
        //Le type de l'expression est entier si tous ses opérandes sont entiers, réel sinon

        String a = ctx.getText();//la c'est toute l'expression
        TinyParser.ArithOperationContext operandes = ctx.arithOperation();

        //TODO: check si operandes est non nulle
        if (operandes != null) {
                System.out.println("operandes\n-----------------");
                String op = operandes.operande().getText();
                System.out.println("op = "+op);
                String tmp = operandes.getText();
                String liste_operateur[] = tmp.split("\\+|\\-|\\*|\\/|\\*\\(|\\)");
                /*Types type;
                for (String oper :
                        liste_operateur) {
                    TsElement dansTS = ts.lookup(oper);
                    if (dansTS != null) {
                        type = dansTS.getType();
                    }
                    System.out.println("oper = " + oper);
                }*/
        }
        /* System.out.println("Fin operandes\n--------------------");
        String [] expression = a.split("=");
        TinyParser.OperandeContext oper = ctx.operande();



        for (int i = 0; i < expression.length; i++) {
            System.out.println("i = "+i+"\n"+expression[i]);
        }
        System.out.println("le getText: "+a);*/

    }


    @Override public void enterArithOperation(TinyParser.ArithOperationContext ctx) {

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitArithOperation(TinyParser.ArithOperationContext ctx) {
        String oper = ctx.operande().getText();
        if (oper != null) {
            TsElement elem = ts.lookup(oper);
            if (elem == null) {
                String errorMessage = "Variable " + ANSI_CYAN + oper + ANSI_RESET + " Non Declare ligne:  " + ANSI_GREEN + ctx.start.getLine() + ANSI_RESET;
                this.tabErrors.add(errorMessage);
            } else {
                //ajouter a la pile pour connaitre le type
                Types type, exType;
                type = elem.getType();
                if (pileExpression.isEmpty()) {
                    pileExpression.push(type);
                } else {
                    exType = (Types) pileExpression.pop();
                    if (exType == type) {
                        pileExpression.push(type);
                    }
                    //si le type actuel est entier et l'autre float


                }
            }

        }
    }
    @Override public void enterOpComparison(TinyParser.OpComparisonContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitOpComparison(TinyParser.OpComparisonContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterComparison(TinyParser.ComparisonContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitComparison(TinyParser.ComparisonContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterConditions(TinyParser.ConditionsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitConditions(TinyParser.ConditionsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterEls(TinyParser.ElsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitEls(TinyParser.ElsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterLoop(TinyParser.LoopContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitLoop(TinyParser.LoopContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterScanInputs(TinyParser.ScanInputsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitScanInputs(TinyParser.ScanInputsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterScan(TinyParser.ScanContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitScan(TinyParser.ScanContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterText(TinyParser.TextContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitText(TinyParser.TextContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterPrint(TinyParser.PrintContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitPrint(TinyParser.PrintContext ctx) { }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterEveryRule(ParserRuleContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitEveryRule(ParserRuleContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void visitTerminal(TerminalNode node) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void visitErrorNode(ErrorNode node) { }

}

