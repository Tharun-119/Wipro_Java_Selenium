package DAY10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {
	public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        ListIterator<String> lt = list.listIterator();

        System.out.println("Forward: ");
        while (lt.hasNext()) {
            System.out.println(lt.next());
        }

        System.out.println("Backward:");
        while (lt.hasPrevious()) {
            System.out.println(lt.previous());
        }
    }
}