 interface Institute{
    void Register();
    void Infrastructure();   //} by default abstract and public.
    void Students();
    void Staff();
    static void staticoncrete(){
        System.out.println("Static concrete method inside interface.");
    }
    default void defconcrete(){
        privconcrete();
        System.out.println("default concrete method inside interface.");
    }
    private void privconcrete(){
        System.out.println("private void method inside interface.");
    }
    // void medicalfacility(){          //concrete method
    //     System.out.println("Medical facilites are optional.");
    // }
}
     class ABES implements Institute{
        public void Register(){
            System.out.println("ABES is registered with AKTU.");
        }
        public void Infrastructure(){
            System.out.println("ABES has digital classrooms.");
        }
        public void Students(){
            System.out.println("Admissions through counselling.");
        }
        public void Staff(){
            System.out.println("ABES has well trained staff.");
        }
        
    }

public class interfaceeg7 {
    public static void main(String[] args) {
        Institute i;
        i= new ABES();
        i.Register();
        i.Infrastructure();
        i.Students();
        i.Staff();

        Institute.staticoncrete();//will be called directly without any object.
        i.defconcrete();
    }
}
