package prog2;

public class Min_max_array {
	public static void main(String[] args) {
        int[] arr = {90, 29, 74, 9, 50};

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }

}
