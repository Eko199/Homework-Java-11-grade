package RealHomework2.Week23.CollectionsExamples;

import java.util.*;

public class TestStaticMethods {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("yellow", "green","red", "blue");
		Collections.reverse(list);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println(list);
		
		List<String> list1 = Arrays.asList("yellow", "red", "green", "blue");
		List<String> list2 = Arrays.asList("white", "black");
		Collections.copy(list1, list2);
		System.out.println(list1);
		
		Collection<String> c1 = Arrays.asList("red", "cyan");
		Collection<String> c2 = Arrays.asList("red", "blue");
		Collection<String> c3 = Arrays.asList("pink", "tan");
		System.out.println(Collections.disjoint(c1, c2));
		System.out.println(Collections.disjoint(c1, c3));
		
		Collection<String> collection = Arrays.asList("red", "cyan", "red");
		System.out.println(Collections.frequency(collection, "red"));
	}
}