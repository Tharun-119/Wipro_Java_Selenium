package prog2;

public class Operator {

    public static void main(String[] args) {
        int a = 13, b = 7;
        System.out.println("Sum: " + (a + b));
        System.out.println("Product: " + (a * b));
        System.out.println("Is a greater than b? " + (a > b));
        boolean condition = (a > b) && (a != b);
        System.out.println("Logical AND result: " + condition);
    }
}



