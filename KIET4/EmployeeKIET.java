package KIET4;

public class EmployeeKIET { 
    // 'public' - is class ko kisi bhi package ke andar use kiya ja sakta hai.
    
    public String Emp_name;  
    // 'public' → Accessible from anywhere (same class, same package, different package, subclasses, other classes)
    
    private int salary;       
    // 'private' → Sirf isi class ke andar accessible hai. Baaki kahin (dusri class ya package) se direct access nahi kar sakte.
    
    protected int Emp_id;     
    // 'protected' → Accessible:
    // 1. Same class
    // 2. Same package
    // 3. Subclasses (even if in different package)
    
    String Organisation;      
    // Ye 'default' (no modifier) hai → Accessible only within the same package (package-private).
    
    void employeedetails(){  
        // default method → same package ke andar hi accessible hai.
        System.out.println("Details of kiet employees are:"+"\n"+Emp_id+" "+Emp_name+"\n");
    }
    
    public static void main(String[] args) {
        // 'main' method is public → JVM isse run kar sakta hai from anywhere.
        
        EmployeeKIET ek=new EmployeeKIET(); // Object create kiya
        
        ek.Emp_name="Vaishnavi";      // 'public' field → accessible anywhere
        ek.Emp_id=206;               // 'protected' field → accessible here (same class)
        ek.salary=200000;            // 'private' field → accessible here (same class only)
        ek.Organisation="KIET GROUPS"; // 'default' field → accessible here (same package)
        
        ek.employeedetails();        // method call
    }
}

