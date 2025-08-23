import java.util.*;
public class employee2 {
    String name;
    double salary;
    public void getdetails(){
       System.out.println("Details are:\n"+"Name:"+name+"\n"+"Salary:"+salary+"$");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        employee2 e= new employee2();//creating an object
        System.out.print("Enter name: ");
        e.name=sc.nextLine();
        System.out.print("Enter Salary: ");
        e.salary=sc.nextDouble();
        e.getdetails();


    }
}
