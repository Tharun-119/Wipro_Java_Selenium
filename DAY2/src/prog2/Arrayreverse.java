package prog2;
public class Arrayreverse {
	public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};

        System.out.println("Reversed array:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
