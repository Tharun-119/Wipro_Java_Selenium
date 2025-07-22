package prog2;

public class Arraysum {
	public static void main(String[] args) {
        int[] arr = {2, 20, 10, 35};
        int sum = 0;

        for (int value : arr) {
            sum += value;
        }

        System.out.println("Sum = " + sum);
    }

}
