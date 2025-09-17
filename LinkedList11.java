import java.util.LinkedList;

public class LinkedList11 {

    public static void main(String[] args) {
        LinkedList <String> employees = new LinkedList<>();
    
    employees.add("John");
    employees.add(1,"Raj");
    employees.addFirst("Sofia");
    employees.addLast("Arjun");
    
    System.out.println("Employees after adding: "+ employees);

    System.out.println("Get First: "+ employees.getFirst());
    System.out.println("Get Last: "+ employees.getLast());
    System.out.println("Get index 2: "+ employees.get(2));

    employees.remove();
    employees.remove(1);
    employees.remove("Raj");
    employees.removeFirst();
    employees.removeLast();
    System.out.println("Employees after removals: "+ employees);


    }

}
