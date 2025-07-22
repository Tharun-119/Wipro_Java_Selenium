package prog2;

public class Bulider_example {
	 public static void main(String[] args) {
	        StringBuilder sb = new StringBuilder();

	        for (int i = 1; i <= 7; i++) {
	            sb.append("Line- ").append(i).append("\n");
	        }

	        System.out.println("Result:\n" + sb);
	    }
}
