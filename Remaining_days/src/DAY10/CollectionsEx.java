package DAY10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CollectionsEx extends JavaCollection {
	public static void main(String[] args) {
		ArrayList<String> courses = new ArrayList<>();
		courses.add("C");
		courses.add("Python");
		courses.add("Data Structures");
		courses.add("C#");
		
		for(String c : courses)
		{
			System.out.println(c);
		}
		
		Set<Integer> cc = new HashSet<>();
		cc.add(102);
		cc.add(107);
		cc.add(108);
		cc.add(112);
		
		for(Integer j : cc)
		{
			System.out.println(j);
		}
		
		Map<String, Integer>courseDuration = new HashMap<>();
		courseDuration.put("C", 102);
		courseDuration.put("Python", 107);
		courseDuration.put("Data Structures", 108);
		courseDuration.put("C#", 112);
		
		for(String c : courseDuration.keySet())
		{
			System.out.println(c + "=" + courseDuration.get(c));
		}
 		
	}
		
}
