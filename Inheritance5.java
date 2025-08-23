class employee{
    int emp_id;
    String emp_name;
    String Org;
    void details(){
        System.out.println("Details are:"+emp_id+" "+emp_name+" "+Org);
    }

}
class faculty extends employee{
    String dept;
    String subject;
    void facultydetails(){
        System.out.println("Department is:"+dept+" "+"\n Subject is: "+subject);
    }

}
public class Inheritance5 {
    public static void main(String[] args) {
        faculty f= new faculty();
        f.emp_id=201;
        f.emp_name="Vaishnavi";
        f.Org="KIET";
        f.facultydetails();
        f.details();
    }
}
