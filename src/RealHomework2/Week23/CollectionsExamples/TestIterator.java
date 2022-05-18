package RealHomework2.Week23.CollectionsExamples;

import java.util.*;

public class TestIterator {
	public static void main(String[] args) {
		Collection<String> collection = new ArrayList<String>();
		collection.add("New York");
		collection.add("Atlanta");
		collection.add("Dallas");
		collection.add("Madison");
		
		Iterator<String> iterator = collection.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next().toUpperCase() + " ");
		}
		System.out.println();
		
		for (String element: collection)
			System.out.print(element.toUpperCase() + " ");
		
		System.out.println();
	}
}
