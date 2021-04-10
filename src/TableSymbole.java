import java.util.HashMap;
import java.util.Map;
/*
    Ici la ligne et la structure de la table des symbole est définie.
 */
//TODO:Implement what i forget to!!



public class TableSymbole {
    /**
     * cette classe devrait contenir toutes les méthodes nécessaire pour  chercher un element dans une table, avoir son type
     * et toute manipulation sur la table des symbole en general
     */

    HashMap<String,TsElement> TS;
    public TableSymbole() {
        this.TS = new HashMap<String,TsElement>();
    }

    public TsElement lookup(String name) {
        /*
            regarder si existe dans la TS ou pas
         */
        if (TS.containsKey(name)) {
            return TS.get(name);
        }
        return null;
    }


    public Boolean addElement(String name, int type, String valeur, Boolean declare)  {

        /*
            Ajouter un elements a la table des symbole!!
         */
        if (lookup(name)==null){

            TsElement newRow = new TsElement(  type, valeur, declare);
                TS.put(name,newRow);
                return false;//tout vas bien
        }else{
            return true;
        }

    }
    public void  printTs(){
        System.out.println("\n Nom \t Type \t Valeur \t declaree");
        System.out.println("------------------------------------------");
        for (Map.Entry<String, TsElement> entry: this.TS.entrySet()) {
            System.out.println("\n "+entry.getKey()+ "\t " + entry.getValue().type + "\t " + entry.getValue().valeur + "\t " + entry.getValue().declare);
            System.out.println("------------------------------------------");
        }
    }

}

class TsElement {
    /*
        Classe contenant les methode sur une ligne de la Table des symboles.
    */
    Types_Tiny type;
    String valeur;
    Boolean declare;
    public TsElement( int type, String valeur, Boolean declare)  {
        switch (type){
            case 1:
                this.type = Types_Tiny.INTEGER;
                break;
            case 2:
                this.type = Types_Tiny.FLOAT;
                break;
            case 3:
                this.type = Types_Tiny.STRING;
            default:
                System.out.println("nous sommes dans default de TsElement");;
        }
        this.valeur = valeur;
        this.declare = declare;
    }


    public Types_Tiny getType() {
        return type;
    }

    public void setType(Types_Tiny type) {
        this.type = type;
    }

    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    public Boolean getDeclare() {
        return declare;
    }

    public void setDeclare(Boolean declare) {
        this.declare = declare;
    }

    @Override
    public String toString() {
        return  "type=" + type +
                ", valeur= " + valeur + '\'' +
                ", declare=" + declare
                ;
    }
}

