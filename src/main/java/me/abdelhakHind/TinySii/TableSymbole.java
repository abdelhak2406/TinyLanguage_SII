package me.abdelhakHind.TinySii;
import java.util.ArrayList;
import java.util.HashMap;
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


    public void addElement(String name,String type, String valeur, Boolean  declare) throws Exception {

        /*
            Ajouter un elements a la table des symbole!!
         */
        if (lookup(name)==null){

            TsElement newRow = new TsElement(  type, valeur, declare);
                TS.put(name,newRow);
        }else{
            System.out.println("Variable preceddament initialiser");//TODO: is it reaaaly the way and is this what i need to say?
        }

    }

}

class TsElement {
    /*
        Classe contenant les methode sur une ligne de la Table des symboles.
     */
    Types type;
    String valeur;
    Boolean declare;
    public TsElement( String type, String valeur, Boolean declare) throws Exception {
        switch (type){
            case "Integer":
                this.type = Types.INTEGER;
                break;
            case "Float":
                this.type = Types.FLOAT;
                break;
            case "Sting":
                this.type = Types.STRING;
            default:
                throw new Exception("Type non reconnu");
        }
        this.valeur = valeur;
        this.declare = declare;
    }


    public Types getType() {
        return type;
    }

    public void setType(Types type) {
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
        return "TableSymbole{" +
                ", type=" + type +
                ", valeur='" + valeur + '\'' +
                ", declare=" + declare +
                '}';
    }
}

