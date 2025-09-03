public class Exception_throw9 {
    public static void main(String[] args) {
        int age=15;
        if(age<18){
            // manually exception throw kiya
            throw new ArithmeticException("Not eligible to vote");
        }
        System.out.println("You can vote.");
    }
}
