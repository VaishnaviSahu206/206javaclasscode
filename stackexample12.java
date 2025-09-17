import java.util.Stack;

public class stackexample12 {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        System.out.println("Stack: "+stack);

        System.out.println("Popped element: "+stack.pop());
        System.out.println("After pop: "+stack);

        System.out.println("Peek element: "+stack.peek());
        System.out.println("After peek: "+stack);

        System.out.println("Search for B: "+stack.search("B"));
        System.out.println("Search for Z: "+stack.search("Z"));

        System.out.println("Is stack empty? "+stack.isEmpty());
        System.out.println("Size of stack: "+stack.size());
    }  
}