package prog2;

public class Count_vowel {
	public static void main(String[] args) {
        String str = "Kesireddy Tharun Venkata Narasimhaswamy";
        int count = 0;

        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Number of vowels: " + count);
    }
}
