package prog2;

public class Largestofthree {
	public static void main(String[] args) {
        int a = 12, b = 27, c = 16;

        if (a >= b && a >= c)
            System.out.println("Largest is: " + a);
        else if (b >= a && b >= c)
            System.out.println("Largest is: " + b);
        else
            System.out.println("Largest is: " + c);
    }
}
