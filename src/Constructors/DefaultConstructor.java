package Constructors;

public class DefaultConstructor {

    //Variables not initialized with initial values
    int a;
    boolean b;

    public static void main(String[] args) {

        // A default constructor is called and initializes variables
        DefaultConstructor obj = new DefaultConstructor();

        System.out.println("Default Value:");
        System.out.println("a = " + obj.a);
        System.out.println("b = " + obj.b);
    }

}
