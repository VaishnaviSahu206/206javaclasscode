import java.util.ArrayDeque;
public class Arraydeque13 {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();

        //Add elements
        deque.add("A");
        deque.add("F");
        deque.add("L");

        //add using offer
        deque.offer("C");
        deque.offerFirst("first");
        deque.offerLast("Last");

        //access elements
        System.out.println("first element (peek): "+ deque.peek());
         System.out.println("first element (peekFirst): "+ deque.peekFirst());
         System.out.println("first element (peekLast): "+ deque.peekLast());

         //remove elements
         System.out.println("Removing elements : ");
         System.out.println("Removed first(removefirst): "+deque.removeFirst());
         System.out.println("Removed first(removelast): "+deque.removeLast());
         System.out.println("Removed first(pollfirst): "+deque.pollFirst());
         System.out.println("Removed first(pollLast): "+deque.pollLast());

         System.out.println("Deque after removals: ");
         System.out.println(deque);

    }
}
