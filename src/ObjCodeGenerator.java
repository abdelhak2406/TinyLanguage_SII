/*
    la classe qui prendra en entrée la liste des quadruplet
    et qui retournera le code objet (assembleur)!!!

 */

import java.util.ArrayList;

public class ObjCodeGenerator {
        ArrayList<QuadElement> quads;
        ArrayList<String> code= new ArrayList<String>();
        boolean erreur ;
        int etiq=0;
        int nb=0;
        public static final String CYAN = "\u001B[36m";
        public static final String RESET = "\u001B[0m";


        public ObjCodeGenerator(QuadGenerator q){
            //quads = q.getQuadruplets();
            this.erreur = q.erreur;
        }

        String acc=" ", x="",y="";
        String T=" ";

        public void createCode(){
            for (QuadElement q: quads){
                if (q.vals[0].equals(":=")) {
                    MOV(q);
                }
                if (q.vals[0].equals("+")) {
                    ADD(q);
                }
                if (q.vals[0].equals("*")) {
                    MUL(q);
                }
                if (q.vals[0].equals("-")) {
                    SUB(q);
                }
                if (q.vals[0].equals("/")) {
                    DIV(q);
                }
                if (q.vals[0].equals("BR")) {
                    BR(q);
                }
                if (q.vals[0].equals("BE")) {
                    BE(q);
                }
                if (q.vals[0].equals("BLE")) {
                    BLE(q);
                }
                if (q.vals[0].equals("BGE")) {
                    BGE(q);
                }
                if (q.vals[0].equals("BG")) {
                    BG(q);
                }
                if (q.vals[0].equals("BL")) {
                    BL(q);
                }
                if (q.vals[0].equals("BNE")) {
                    BNE(q);
                }
                if(q.vals[0].equals("READ")){
                    this.code.add(" "+"READ "+q.vals[3]);
                }
                if (q.vals[0].equals("WRITE")){
                    this.code.add(" "+"WRITE "+q.vals[3]);
                }
                if (q.vals[1].equals("END")){
                    if(nb==etiq) {
                        this.code.add(CYAN + "etiq" + etiq + RESET + "  MOV AX 4COOH");
                    }
                    else {
                        this.code.add(" "+ "MOV AX 4COOH");
                    }
                    this.code.add(" " + "INT 21H");
                }
                nb++;
            }
        }


        public void GetInAcc(String x, String y){

            this.x = x;
            this.y=y;
            if(acc.equals(" ")){
                this.code.add(" "+"LOAD "+x);
                acc=x;
            }
            else if(acc.equals(y)){
                T=x;
                this.x=y;
                this.y=T;
            }
            else if(!acc.equals(x)){
                this.code.add(" "+"STORE "+acc);
                if(nb == etiq){
                    this.code.add(CYAN+"etiq"+etiq+RESET+" LOAD "+x);
                }
                else {
                    this.code.add(" "+"LOAD " + x);
                }
                acc=x;
            }
        }

        /*_________________________INSTRUCTIONS_________________________*/

        public void MOV(QuadElement quad){
            GetInAcc(quad.vals[1], " ");
            this.code.add(" "+"MOV "+quad.vals[3]+" AX");
            acc=quad.vals[3];

        }
        public void ADD(QuadElement  quad){
            GetInAcc(quad.vals[1], quad.vals[2]);
            this.code.add(" "+"ADD "+"AX "+this.y);
            acc=quad.vals[3];
        }
        public void MUL(QuadElement  quad){
            GetInAcc(quad.vals[1], quad.vals[2]);
            this.code.add(" "+"MUL "+"AX "+this.y);

            acc=quad.vals[3];
        }
        public void SUB(QuadElement  quad){
            GetInAcc(quad.vals[1]," ");
            this.code.add(" "+"SUB "+"AX "+quad.vals[2]);
            acc=quad.vals[3];
        }
        public void DIV(QuadElement quad){
            GetInAcc(quad.vals[1], " ");
            this.code.add(" "+"DIV "+"AX "+quad.vals[2]);
            acc=quad.vals[3];
        }

        public void BR(QuadElement  quad){
            this.code.add(" "+"JMP"+CYAN+" etiq"+quad.vals[3]+RESET);
            etiq=Integer.valueOf(quad.vals[3]);
        }

        public void BLE(QuadElement  quad){
            GetInAcc(quad.vals[1], " ");
            this.code.add(" "+"CMP "+"AX "+quad.vals[2]);
            this.code.add(" "+"JLE"+CYAN+" etiq"+quad.vals[3]+RESET);
            etiq=Integer.valueOf(quad.vals[3]);
        }
        public void BGE(QuadElement  quad){
            GetInAcc(quad.vals[1], " ");
            this.code.add(" "+"CMP "+"AX "+quad.vals[2]);
            this.code.add(" "+"JGE"+CYAN+" etiq"+quad.vals[3]+RESET);
            etiq=Integer.valueOf(quad.vals[3]);
        }

        public void BG(QuadElement  quad){
            GetInAcc(quad.vals[1], " ");
            this.code.add(" "+"CMP "+"AX "+quad.vals[2]);
            this.code.add(" "+"JG"+CYAN+" etiq"+quad.vals[3]+RESET);
            etiq=Integer.valueOf(quad.vals[3]);
        }
        public void BL(QuadElement quad){
            GetInAcc(quad.vals[1], " ");
            this.code.add(" "+"CMP "+"AX "+quad.vals[2]);
            this.code.add(" "+"JL"+CYAN+" etiq"+quad.vals[3]+RESET);
            etiq=Integer.valueOf(quad.vals[3]);
        }
        public void BE(QuadElement  quad){
            GetInAcc(quad.vals[1], " ");
            this.code.add(" "+"CMP "+"AX "+quad.vals[2]);
            this.code.add(" "+"JE"+CYAN+" etiq"+quad.vals[3]+RESET);
            etiq=Integer.valueOf(quad.vals[3]);
        }
        public void BNE(QuadElement  quad){
            GetInAcc(quad.vals[1], " ");
            this.code.add(" "+"CMP "+"AX "+quad.vals[2]);
            this.code.add(" "+"JNE"+CYAN+" etiq"+quad.vals[3]+RESET);
            etiq=Integer.valueOf(quad.vals[3]);
        }

        /*_________________________AFFICHAGE______________________*/

        public void afficherCode(){
            if (this.erreur){
                //Main.print_color("UNE OU PLUSIEURS ERREURS => PAS DE CODE ASSEMBLEUR.");
            }else {
                System.out.println("________________CODE ASSEMBLEUR__________________");
                for (int i = 0; i < code.size(); i++) {
                    System.out.println(code.get(i));
                }
            }
        }

}
