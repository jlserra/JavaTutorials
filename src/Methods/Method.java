package Methods;

public class Method {

    public static void main(String[] args) {

        int num1 = 25;
        int num2 = 15;

        Method obj = new Method();               // create an object of Main
        obj.addDescription();                    // calling method without parameters
        int result = obj.addNumbers(num1, num2); // calling method with parameters and has return type
        System.out.println("Sum is: " + result);
    }

    // method without parameters
    public void addDescription(){
        System.out.println("Taking two numbers and adding them together");
    }

    // method that accepts 2 parameters and returns int
    public int addNumbers(int a, int b) {
        int sum = a + b;
        // return value
        return sum;
    }

}

