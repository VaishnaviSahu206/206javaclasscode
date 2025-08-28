 abstract class College{
    abstract void Register();
    abstract void Infrastructure();
    abstract void Students();
    abstract void Staff();
    void medicalfacility(){          //concrete method
        System.out.println("Medical facilites are optional.");
    }
}
     class KIET extends College{
        void Register(){
            System.out.println("KIET is registered with AKTU.");
        }
        void Infrastructure(){
            System.out.println("KIET has digital classrooms.");
        }
        void Students(){
            System.out.println("Admissions through counselling.");
        }
        void Staff(){
            System.out.println("KIET has well trained staff.");
        }
        void medicalfacility(){
            System.out.println("KIET has its own hospital inside campus.");
        }
    }

public class AbstractExample7 {
    public static void main(String[] args) {
        College cg;
        cg= new KIET();
        cg.Register();
        cg.Infrastructure();
        cg.Students();
        cg.Staff();
        cg.medicalfacility();
    }
}
