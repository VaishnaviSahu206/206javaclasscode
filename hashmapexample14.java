import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
public class hashmapexample14 {
    public static void main(String[] args) {
        
    HashMap<Integer,String> aiml= new HashMap<>();

    //adding the values
    aiml.put(1,"Akash");
    aiml.put(2,"Astha");
    aiml.put(6,"Shreya");
    aiml.put(7,"Varun");
    aiml.put(5,"Shreya");

    aiml.put(3,null);
    aiml.put(4,null);
    aiml.put(null,"Laxmi");//only one null key is acceptable in hashmap

    //printing the values
    System.out.println(aiml);
    System.out.println("Map elements with for-each loop");

     System.out.println("Traversing with a key");
     for(Integer key: aiml.keySet()){
        System.out.println("key"+" "+aiml.get(key));
     }

     System.out.println("traversing via entry");
     for(Entry<Integer,String> entry : aiml.entrySet()){
        System.out.println(entry.getKey()+" "+entry.getValue());
     }

     Iterator<Map.Entry<Integer , String>> itr = aiml.entrySet().iterator();
     while(itr.hasNext()){
        Map.Entry<Integer,String> entry= itr.next();
        System.out.println("key: "+ entry.getKey()+", Value: "+entry.getValue());
     }


    }
}
