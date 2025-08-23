package KIET4;

public class HRDept {
    public static void main(String[] args) {
        EmployeeKIET ek = new EmployeeKIET(); // Object create of EmployeeKIET class

        ek.Emp_name = "Shikha";// 'public' → Accessible anywhere (same package / different package).
        
        ek.Emp_id = 109;// 'protected' → Accessible here because HRDept is in the SAME package 'KIET'.
        // Agar ye class different package me hoti aur subclass nahi hoti, to direct access possible nahi hota.
        
        // ek.salary = 200000;// 'private' → Not accessible outside EmployeeKIET class.
        // Isliye yahan error aayega (salary field invisible for HRDept).
        
        ek.Organisation = "KIET GROUPS";// 'default' (no modifier) → Accessible here because both classes are in the SAME package 'KIET'.
        
        ek.employeedetails();// method is default (package-private) → Accessible within the same package.
    }
}

