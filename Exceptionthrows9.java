class example{
    int salary;
    // Constructor me throws use hua hai
    example(int salary) throws IllegalArgumentException{
        if(salary<=0)// Agar salary 0 ya negative hai to exception throw karo
        {
        throw new IllegalArgumentException("salary must be greater than 0");
        }
        this.salary=salary;
        System.out.println(salary);
    }
}

public class Exceptionthrows9 {
    public static void main(String[] args) {
        try{
            example e= new example(0);//Constructor me condition fail ho gayi (salary <= 0), isliye exception throw hua.
        }
         //Wo exception catch block me gaya, aur print ho gaya.
        catch(IllegalArgumentException e){
            System.out.println(e);
        }
    }
}
