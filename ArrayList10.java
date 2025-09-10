import java.util.ArrayList;
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

        fruits.add(1,"Guava");
        System.out.println(fruits);

        System.out.println(fruits.get(3));
        System.out.println(fruits.set(1,"Mango"));


    }
}
