package Constructors;

public class NoArgConstructor {

    // constructor accepting single value
    public NoArgConstructor() {
        System.out.println("No Argument Constructor");
    }

    public static void main(String[] args) {

        // call constructor by passing a single value
        NoArgConstructor obj1 = new NoArgConstructor();
        NoArgConstructor obj2 = new NoArgConstructor();
        NoArgConstructor obj3 = new NoArgConstructor();
    }
}

