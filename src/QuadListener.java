/*
    Classe qui permet d'implementer les methodes necessaire afin de generer les quadruplets

 */

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Stack;


public class QuadListener extends TinyParserBaseListener {
    Quadruplets quads = new Quaduplets();
    boolean erreur = false;
    TableSymbole ts ;

    int debutsi = -1;
    int debutsinon = -1;
    boolean br_added = false;

    String type;
    int nbtemp;
    Stack nom = new Stack();
    Stack val = new Stack();
    Stack cond = new Stack();
    Stack nou = new Stack();
    Stack fin = new Stack();

    /********************************************AFFECTATION*******************************/
    @Override public void enterAff(TinyParser.AffContext ctx){
        type = null;
        nbtemp = 0;
    }
    @Override public void exitId(TinyParser.IdContext ctx){
        if (ts.getElement(ctx.getText()) == null){
            this.erreur = true;
            Main.print_color("identificateur non declaré à la ligne : " + ctx.getStart().getLine());
            return;
        }
        if(ts.getElement(ctx.getText()).value==null){
            Main.print_color("variable non initialisé a la ligne : " + ctx.getStart().getLine());
            erreur = true;
            return;
        }
        if(type==null){
            type = ts.getElement(ctx.getText()).type;
            val.push(ts.getElement(ctx.getText()).value);
            nom.push(ctx.getText());
        }
        else{
            if(type.equals(ts.getElement(ctx.getText()).type)){
                val.push(ts.getElement(ctx.getText()).value);
                nom.push(ctx.getText());
            }else{
                Main.print_color("type incompatible à la ligne : " + ctx.getStart().getLine());
                erreur = true;
            }
        }

    }
    @Override public void exitInteger(TinyParser.IntegerContext ctx){
        if(type==null){
            type = "int";
            val.push(ctx.getText());
            nom.push(ctx.getText());
        }
        else{
            if(type.equals("int")){
                val.push(ctx.getText());
                nom.push(ctx.getText());
            }else{
                Main.print_color("type incompatible à la ligne : " + ctx.getStart().getLine());
                erreur = true;
            }
        }
    }
    @Override public void exitFloat(TinyParser.FloatContext ctx){
        if(type==null){
            type = "float";
            val.push(ctx.getText());
            nom.push(ctx.getText());
        }
        else{
            if(type.equals("float")){
                val.push(ctx.getText());
                nom.push(ctx.getText());
            }else{
                Main.print_color("Type incompatible à la ligne : " + ctx.getStart().getLine());
                erreur = true;
            }
        }
    }
    @Override public void exitArith_div(TinyParser.Arith_divContext ctx) {
        if(type.equals("string")){
            Main.print_color("Operation non valide pour le type String a la ligne : " + ctx.getStart().getLine());
            erreur = true;
        }
        if(!erreur) {
            if (type.equals("int")) {
                int i, j;
                nbtemp++;
                i = Integer.valueOf(val.pop().toString());
                j = Integer.valueOf(val.pop().toString());
                if (i == 0) {
                    Main.print_color("division sur 0 a la ligne : " + ctx.getStart().getLine());
                    erreur = true;
                    return;
                }
                val.push(j / i);

                String ch2 = nom.pop().toString();
                String ch1 = nom.pop().toString();
                QuadElement q = new QuadElement("/",ch1,ch2,"T"+nbtemp);
                quadruplets.addQuad(q);
                nom.push("T"+nbtemp);
                return;
            }
            if (type.equals("float")) {
                float i, j;
                nbtemp++;
                i = Float.valueOf(val.pop().toString());
                j = Float.valueOf(val.pop().toString());
                if (i == 0) {
                    Main.print_color("division sur 0 a la ligne : " + ctx.getStart().getLine());
                    erreur = true;
                    return;
                }
                val.push(j / i);

                String ch2 = nom.pop().toString();
                String ch1 = nom.pop().toString();
                Quad q = new Quad("/",ch1,ch2,"T"+nbtemp);
                quads.addQuad(q);
                nom.push("T"+nbtemp);
                return;
            }
        }

    }
    @Override public void exitArith_mult(TinyParser.Arith_multContext ctx) { }
    @Override public void exitArith_add(TinyParser.Arith_addContext ctx) { }
    @Override public void exitArith_sub(TinyParser.Arith_subContext ctx) { }
    @Override public void exitAff(TinyParser.AffContext ctx) { }

    /********************************************COMPARAISON******************************IS IT NECESSARY*/
    @Override public void enterComparison(TinyParser.ComparisonContext ctx) { }
    @Override public void exitComparison(TinyParser.ComparisonContext ctx) { }
    /********************************************CONDITIONS(IF ELSE) RE-DISCUSS*******************************/
    @Override public void exitIf_aff(TinyParser.If_affContext ctx) { }
    @Override public void exitIfelse_aff(TinyParser.Ifelse_affContext ctx) { }
    /********************************************LOOP*******************************/
    @Override public void enterLoop(TinyParser.LoopContext ctx) { }
    @Override public void exitLoop(TinyParser.LoopContext ctx) { }
    /********************************************SCAN*******************************/
     @Override public void enterScanInputs(TinyParser.ScanInputsContext ctx) { }
    @Override public void exitScanInputs(TinyParser.ScanInputsContext ctx) { }
    @Override public void enterScan(TinyParser.ScanContext ctx) { }
    @Override public void exitScan(TinyParser.ScanContext ctx) { }
    /********************************************READ*******************************/
    @Override public void enterText(TinyParser.TextContext ctx) { }
    @Override public void exitText(TinyParser.TextContext ctx) { }
    @Override public void enterPrint(TinyParser.PrintContext ctx) { }
    @Override public void exitPrint(TinyParser.PrintContext ctx) { }
    /*************************************END OF CODE********************************/
    @Override public void exitStart(TinyParser.StartContext ctx) { }
}
