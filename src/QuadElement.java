public class QuadElement {
        String vals[];


        public QuadElement(String Operation,String oper1,String oper2,String Temp)
        {
                vals = new String[4];
                vals[0] = Operation;
                vals[1] = oper1;
                vals[2] = oper2;
                vals[3] = Temp;
        }

        public String get(int index)
        {
                return vals[index];
        }

        public void set(int index, String s)
        {
                vals[index] = s;
        }

        @Override
        public String toString()
        {
                return "("+vals[0]+","+vals[1]+","+vals[2]+","+vals[3]+")";
        }

}
