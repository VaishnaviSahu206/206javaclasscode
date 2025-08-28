// Parent class
class EmployeePoly {
    String Emp_name;   // Employee ka naam store karne ke liye instance variable
    // Method 1 (no parameters) → Overloading ka part
    void details() {
        System.out.println("Name: " + Emp_name);
    }

    // Method 2 (int, String) → Overloaded method
    void details(int salary, String company) {
        System.out.println("Salary: " + salary);
    }

    // Method 3 (String) → Overloaded method
    void details(String company) {
        System.out.println("Institute name: " + company);
    }
}

// Child class jo EmployeePoly ko inherit karti hai
class faculty extends EmployeePoly {

    // details() method ko override kar diya
    @Override
    void details() {
        // super.details() → Parent class ka details() call karega
        super.details();   // Parent ke method ka output print hoga (name wala)
        
        // Child class ka apna extra behaviour
        System.out.println("Welcome Faculties!");
    }
}


// Driver class
public class Polymorphism6 {
    public static void main(String[] args) {
        
        // Parent class ka object
        EmployeePoly ep = new EmployeePoly();
        ep.Emp_name = "Kia";   // name assign kiya
        
        // Compile-time Polymorphism (Method Overloading)
        ep.details();                  // details() → name print karega
        ep.details(207890, "ABES");    // details(int, String) → salary print karega
        ep.details("KIET");            // details(String) → institute print karega

        System.out.println("---------------------------");

        // Child class ka object
        faculty f = new faculty();
        // Run-time Polymorphism (Method Overriding)
        f.details();   // faculty class ka details() call hoga 
                       // jo super.details() (parent) + apna line print karega
    }
}
