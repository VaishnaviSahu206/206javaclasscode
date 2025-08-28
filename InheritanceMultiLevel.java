// Base class (Parent Class)
class Employee{
    int Emp_id;                   // Instance variable for Employee ID
    String Emp_name;              // Instance variable for Employee Name
    static String Organisation="KIET";   // Static variable (same for all objects)

    // Method to display common employee details
    void details(){
        System.out.println("  Emp ID: " +Emp_id +"\n"+
                           "  Name: "+Emp_name+"\n"+
                           "  Organisation: "+Organisation);
    }
}

// Faculty class inherits Employee class (Single Inheritance)
class Faculty extends Employee{
    String Department;           
    String subject;             
    String Designation;           

    // Method to display faculty specific details
    void facultyDetails(){
        System.out.println("Department: "+Department +"\n"+"Subject: "+subject+"\n"+"Designation:"+Designation);
    }  
}

// ResearchFaculty class inherits Faculty class (Multi-Level Inheritance)
// Chain: Employee → Faculty → ResearchFaculty
class ResearchFaculty extends Faculty{
    String researchArea;          
    int paperPublished;           

    // Method to display research specific details
    void researchDetails(){
        System.out.println(Emp_name +" has been published "+paperPublished +
                           " papers in "+researchArea+ " domain.");
    }
}


// Driver/Main Class
public class InheritanceMultiLevel {

    public static void main(String[] args) {

        // Creating Faculty object
        Faculty f = new Faculty();
        f.Emp_id=101;                        // Inherited from Employee
        f.Emp_name="Deepak Kumar";           // Inherited from Employee
        f.Department="AIML";                 // Belongs to Faculty class
        f.subject="Maths";                   // Belongs to Faculty class
        f.Designation="Assitant Professor";  // Belongs to Faculty class

        System.out.println("Details of the Faculties are:");    
        f.details();           // Calls Employee class method
        f.facultyDetails();    // Calls Faculty class method

        System.out.println("--------------------------------------");

        // Creating ResearchFaculty object
        ResearchFaculty rf1=new ResearchFaculty();
        rf1.Emp_id=999;                        // Inherited from Employee
        rf1.Emp_name="Akhilesh";               // Inherited from Employee
        rf1.Department="Pharma";               // Inherited from Faculty
        rf1.Designation="Associate Professor"; // Inherited from Faculty
        rf1.researchArea="\"Pharma Industry in Pollution\""; // Own variable
        rf1.paperPublished=10;                 // Own variable

        // Calling all methods (multi-level inheritance in action)
        rf1.details();          // Method from Employee class
        rf1.facultyDetails();   // Method from Faculty class
        rf1.researchDetails();  // Method from ResearchFaculty class
    }
}
