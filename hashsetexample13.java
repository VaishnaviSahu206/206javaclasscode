import java.util.HashSet;
import java.util.TreeSet;
public class hashsetexample13 {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(11);
        numbers.add(2);

        System.out.println("Hashset 2 : "+ numbers);
        
        HashSet<Integer> number1 = new HashSet<>();
        number1.add(21);
        number1.add(12);
        number1.add(111);
        number1.add(23);

        System.out.println("Hashset 2: "+ number1);

        //union- addALL , INTERSECTION- retainAll,difference-removeAll
        number1.addAll(numbers);
        System.out.println("After union set2: "+ numbers);

        number1.removeAll(numbers);
        System.out.println("After Difference: "+ number1);

        number1.retainAll(numbers);
        System.out.println("After intersection: "+ number1);





    }
}
