package ABES4;            // Different package
import KIET4.*;

public class EmployeeABES extends EmployeeKIET {
    public static void main(String[] args) {
        EmployeeABES ae = new EmployeeABES();// Subclass object bana rahe hain (different package ke andar)

        ae.Emp_name = "Shubhi"; // ✅ 'public' → Accessible anywhere (same class, same package, subclass, different package).
        
        ae.Emp_id = 10899;// ✅'protected' → Accessible in subclass, even if in a different package.
        
        // ae.salary = 200000;// ❌'private' → Accessible only within EmployeeKIET class itself.
        // Yahan access nahi milega (compilation error).
        
        //ae.Organisation = "ABC GROUPS"; // ❌'default' (no modifier) → Accessible only within SAME package.
        // Different package se direct access nahi hoga.
    }
}
