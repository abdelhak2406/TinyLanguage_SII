import java.util.ArrayList;

public class QuadElement {

        ArrayList<String> vals = new ArrayList<String>(4);


        public QuadElement(String Operation,String oper1,String oper2,String Temp)
        {
               this.vals.add(Operation);
                this.vals.add(oper1);
                this.vals.add(oper2);
                this.vals.add(Temp) ;
        }

        public String get(int index)
        {
                return vals.get(index);
        }

        public void set(int index, String s)
        {
                vals.set(index,s) ;
        }

        @Override
        public String toString()
        {
                return "("+vals.get(0)+","+vals.get(1)+","+vals.get(2)+","+vals.get(3)+")";
        }

}
