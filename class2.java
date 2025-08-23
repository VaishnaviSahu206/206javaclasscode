//METHODS of JAVA
public class class2 {
    int id;//id=instance variable
    String name;
    class2(){//CONSTRUCTOR(values initialise krna)
 System.out.println("Hello from defaultconstructor!");
    }
    class2(int id,String name){//here,id&name are local variables
    this.id=id;
    this.name/*(instance)*/=name/*(local)*/;
    }
    public void displayMethod(){
        System.out.println("Hello from displayMethod!");
        System.out.println("Details are:\n"+"Name:"+name+"\n"+"id:"+id);
    }
    public static void main(String[] args) {
        class2 m1 = new class2();// classname x(any variable)=new classname();(m=reference variable)
        m1.name="Vaishnavi";
        m1.id=206;
        m1.displayMethod();
        class2 m2=new class2();
        m2.id=400206;
        m2.name="Vaishnavi Sahu";
        m2.displayMethod();
        class2 m3=new class2(111,"qwerty");
        m3.displayMethod();
    }
}

