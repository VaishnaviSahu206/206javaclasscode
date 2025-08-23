public class EmployeeStatic5 {
    int Emp_id;
     static String Org;

     static{            //STATIC BLOCK,,,STATIC>>CONSTRUCTOR>>METHOD
        Org="KIET";
     }
     static void staticmethod(){
        System.out.println("this is a static method.");
        //System.out.println("ID: "+Emp_id+"\n"+" "+"Organisation is: "+Org);
     }
    void details(){
        System.out.println("ID: "+Emp_id+"\n"+" "+"Organisation is: "+Org);
    }
    public static void main(String[] args) {
       // EmployeeStatic5.Org="KIET";
        EmployeeStatic5 es= new EmployeeStatic5();
        es.Emp_id=101;
        //es.Org="KIET";
        es.details();
        EmployeeStatic5 es2= new EmployeeStatic5();
        es2.Emp_id=102;
        //es2.Org="KIET";//no need to declare every time, by using static keyword.
        es2.details();
        staticmethod();
        //details();cant write is this way
    }
}
