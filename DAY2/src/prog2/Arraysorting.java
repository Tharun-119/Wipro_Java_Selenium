package prog2;
import java.util.Arrays;
public class Arraysorting {
	public static void main(String[] args) {
        int[] arr = {989, 678, 345, 765, 876};

        Arrays.sort(arr);

        System.out.println("Sorted array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }


}
