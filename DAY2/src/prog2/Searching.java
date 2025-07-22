package prog2;

public class Searching {
	public static void main(String[] args) {
        int[] arr = {1, 12, 23, 34, 45};
        int key = 23;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found.");
        }
    }


}
