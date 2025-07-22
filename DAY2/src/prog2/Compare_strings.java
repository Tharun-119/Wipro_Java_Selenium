package prog2;

public class Compare_strings {
	public static void main(String[] args) {
        String str = "Java";
        str.concat(" World");  // Not stored
        System.out.println("String (immutable): " + str);  

        StringBuffer sb1 = new StringBuffer("Java");
        sb1.append(" World");
        System.out.println("StringBuffer (mutable): " + sb1);

        StringBuilder sb2 = new StringBuilder("Java");
        sb2.append(" World");
        System.out.println("StringBuilder (mutable): " + sb2);
    }

}
