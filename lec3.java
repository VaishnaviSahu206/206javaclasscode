// COPY CONSTRUCTOR Example (Employee ka data copy karna)
public class lec3 {
    int Emp_id;       
    String Emp_name;

    // Normal constructor: jab hum directly values pass karke object banate hain
    lec3(int i, String name) {
        Emp_id = i;        // is object (newly created) ka Emp_id set ho jayega
        Emp_name = name;   // is object ka Emp_name set ho jayega
    }

    // Copy constructor: ek existing object ka data copy karke naya object banata hai
    // Parameter 'e' wo object hai jiska data hum copy kar rahe hain
    lec3(lec3 e) {
        Emp_id = e.Emp_id;       // naye object ka Emp_id = purane object ka Emp_id
        Emp_name = e.Emp_name;   // naye object ka Emp_name = purane object ka Emp_name
    }

    // Method jo employee ki details print karega
    void print_info() {
        System.out.println("Details of employee are: " + Emp_id + " " + Emp_name);
    }

    // Main method jahan program execution start hota hai
    public static void main(String[] args) {
        // Step 1: e1 object banaya using normal constructor (values diye manually)
        lec3 e1 = new lec3(206, "Vaishnavi");
        e1.print_info();   
        
        lec3 e2 = new lec3(e1);// Step 2: e2 object banaya using copy constructor
        // Yahan e1 pass kiya gaya, matlab e2 ke andar e1 ka data copy ho jaayega

        // Step 3: e2 ki details print karna (same output as e1 kyunki copy hua hai)
        e2.print_info();                     
        e1.Emp_id=89;
        e1.print_info();
        e2.print_info();
        
    }
}


// lec3 ecc;
                        // ecc=e1;
                        // ecc.print_info();                                ** WRONG METHOD!!
                        // e1.Emp_id=7;
                        // e1.Emp_name="riya";
                        // System.out.println("Details after change in e1:");
                        // e1.print_info();
                        // // ecc.Emp_id=7;
                        // // ecc.Emp_name="riya";
                        // //  System.out.println("Details after change in ecc:");
                        // ecc.print_info();
