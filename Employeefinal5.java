public class Employeefinal5 {
    final String Org="KIET";
     final void detailsofemployee(){//final prevents overriding
        System.out.println(Org);
    }
    public static void main(String[] args) {
        Employeefinal5 ef= new Employeefinal5();
       // ef.Org="ABES";
       ef.detailsofemployee();
    }

}
class faculty extends Employeefinal5{
    // void detailsofemployee(){
    //     System.out.println("welcome to overriding.");
    // }
    public static void main(String[] args) {
        faculty fc= new faculty();
        fc.detailsofemployee();
    }
        
}


