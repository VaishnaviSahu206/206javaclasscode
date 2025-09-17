import java.util.PriorityQueue;
public class Priorityqueue12 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(30);
        pq.add(20);
        pq.add(10);
        System.out.println("Priority Queue: "+pq);   //insertion min-heap wise

        System.out.println("added using offer: "+pq.offer(5));
        System.out.println("Deleted element: "+pq.poll());   //deletion is done on the basis of priority and if empty it show null
        System.out.println("After poll: "+pq);

        System.out.println("remove 20: "+pq.remove(20));    //empty hone pe exception throw karega

        System.out.println("Is empty? "+pq.isEmpty());


    }
}