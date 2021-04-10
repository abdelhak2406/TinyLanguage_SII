/*
    la classe qui prendra en entrée la liste des quadruplet
    et qui retournera le code objet (assembleur)!!!

 */

import java.util.ArrayList;

public class ObjCodeGenerator {
    ArrayList<QuadElement> quads;
    ArrayList<String>   code = new ArrayList<String>();
    boolean erreur;
    int etiq = 0;
    int nb = 0;
    public static final String CYAN = "\u001B[36m";
    public static final String RESET = "\u001B[0m";


    public ObjCodeGenerator(QuadGenerator q) {
        this.quads = q.getQueads();
    }

    private String getBrEquivalent(String branchement) {
        switch (branchement) {
            case "BE":
                return "JE";
            case "BNE":
                return "JNE";
            case "BL":
                return "JL";
            case "BG":
                return "JG";
            case "BZ":
                return "JZ";
            case "BNZ":
                return "JNZ";
            case "BR":
                return "JMP";
            default:
                return null;
        }
    }

    private String getOptEquivalent(String operateur) {
        switch (operateur) {
            case "+":
                return "ADD";
            case "-":
                return "SUB";
            case "/":
                return "DIV";
            case "*":
                return "MUL";
            default:
                return null;
        }
    }


    public void createCode() {
        int i;
        for (i = 0; i < this.quads.size(); i++) {
            QuadElement quad = this.quads.get(i);
            String opt = this.getOptEquivalent(quad.get(0));
            if (opt != null) {
                this.code.add("MOV Ax, " + quad.get(1));
                this.code.add(opt + " Ax, " + quad.get(2));
                this.code.add("MOV " + quad.get(3) + ", Ax");
            } else {
                opt = this.getBrEquivalent(this.quads.get(i).get(0));
                if (opt != null) {
                    if (opt.equals("JZ") || opt.equals("JNZ")) {
                        this.code.add("MOV AX, " + quad.get(2));
                        this.code.add("CMP AX, 0");
                        this.code.add(opt + " " + quad.get(1));
                    } else {
                        if (opt.equals("JMP")) {
                            this.code.add(opt + " " + quad.get(1));
                        } else {
                            this.code.add("MOV AX, " + quad.get(2));
                            this.code.add("CMP AX, " + quad.get(3));
                            this.code.add(opt + " " + quad.get(1));
                        }
                    }
                } else {
                    opt = quad.get(0);
                    if (opt.equals("="))
                        this.code.add("Mov " + quad.get(3) + ", " + quad.get(1));

                    if (opt.equals("READ"))
                        this.code.add("INPUT " + quad.get(1));

                    if (opt.equals("WRITE"))
                        this.code.add("OUTPUT " + quad.get(1));
                }
            }
        }
    }

    public void afficherCode(){
        System.out.println("\nCode Assembleur");
        System.out.println("----------------");
        for (String s: this.code) {
            System.out.println(s);
        }
    }

}