//TODO: Implementer tout ce qui reste!

/*
    classe qui est cencé contenir tout ce dont nous avons besoin en ce qui
    concerne la manipulation des quadruplets
 */

import java.util.ArrayList;

public class Quadruplets {

    ArrayList<QuadElement> QuadTable = new ArrayList<QuadElement>();;



    public void addQuad(QuadElement q){
        QuadTable.add(q);
    }
    public QuadElement getQuad(int index){
        return QuadTable.get(index);
    }
    public void setQuad(int index,String value, int position){
        QuadElement q = QuadTable.get(index);
        q.set(position,value);
        QuadTable.set(index,q);
    }
    public int size(){
        return QuadTable.size();
    }
    public ArrayList<QuadElement> getArray(){
        return QuadTable;
    }
    public void printQuad(){
        for (int index = 0; index < this.QuadTable.size(); index++) {
            System.out.println(index+"- "+QuadTable.get(index));
        }
    }

}

