import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class ArrayList10 {
    public static void main(String[] args) {
        ArrayList <String> fruits=new ArrayList();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");
        // fruits.add(123);
        // fruits.add(675.4);  NOT APPLICABLE WHEN "<String>" IS USED
        System.out.println(fruits);

        for(String s:fruits){
            System.out.println(s);
        }
        System.out.println("---------------- Add at specific index ----------------");
        fruits.add(1,"Guava");
        System.out.println(fruits);

        System.out.println("--------------Get-------------");
        System.out.println(fruits.get(3));

        System.out.println("---------------- Update element ----------------");
        System.out.println(fruits.set(1,"Mango"));

        
        System.out.println("---------------- Remove elements ----------------");
        fruits.remove(1); // by index
        System.out.println("After removing index 1: " + fruits);


         for(String s:fruits){
            System.out.println(s);
         }
         Iterator itr=fruits.iterator();
         while(itr.hasNext()){
            System.out.println(itr.next());
         }

         Collections.sort(fruits);
         System.out.println(fruits);

         System.out.println(Collections.binarySearch(fruits,"Berry"));

         fruits.clear();
        
    }
}
