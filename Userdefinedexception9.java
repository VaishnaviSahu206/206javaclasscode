//ek custom exception class banayi InvalidEmployeeID jo Exception ko extend karti hai.
class InvalidEmployeeID extends Exception{
    InvalidEmployeeID(String message){
        super(message);//parent Exception class ko custom error message bhejta hai
    }
}
class Emp_loyee{
    int emp_id;
    String emp_name;
    Emp_loyee(int emp_id,String emp_name) throws InvalidEmployeeID{
        if(emp_id<=0){
            throw new InvalidEmployeeID("Employee ID must be positive.");
        }
        this.emp_id= emp_id;
        this.emp_name=emp_name;
        System.out.println("Employee created: "+emp_id+" - "+emp_name);
    }
}
public class Userdefinedexception9 {
    public static void main(String[] args) {
        try{
            Emp_loyee e1= new Emp_loyee(101,"Vaishnavi");//valid
            Emp_loyee e2= new Emp_loyee(0,"Shikha");//invalid
        }
        catch(InvalidEmployeeID e){
            System.out.println("custom exception: "+e);
        }
        
    }
}
