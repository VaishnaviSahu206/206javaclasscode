import java.util.Scanner;

public class StringEx10{
    public static void main(String[] args) {
        String name="Vaishnavi";
        int len= name.length();
        System.out.println("Length of string is: "+ len);
        System.out.println(name.toUpperCase());
        System.out.println(name.substring(1,4).toUpperCase());

        String s="VAISHNAVI";
        if(name.equals(s)){//case sensitive
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
            Scanner in = new Scanner(System.in);
            String st= in.nextLine();
            System.out.println(st);
    }
}