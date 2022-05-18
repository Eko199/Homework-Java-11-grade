package RealHomework2.Week24.PriorityQueue_demo;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) {
//		PriorityQueue<Person> people = new PriorityQueue <Person>(3, new Comparator<Person>() {
//
//			@Override
//			public int compare(Person p1, Person p2) {
//				return p1.getAge() -  p2.getAge();
//			}
//			
//		});
		
		
//		PriorityQueue<Person> people = new PriorityQueue <Person>();
		
//		PriorityQueue<Person> people = new PriorityQueue <Person>(10, Collections.reverseOrder());
		
//    	PriorityQueue<Person> people = new PriorityQueue <Person>(10, new SortByAge());
		
//		PriorityQueue<Person> people = new PriorityQueue <Person>(10, new SortByName());
		
		PriorityQueue<Person> people = new PriorityQueue <Person>(10, new PersonSortingComparator());
		
		
		people.add(new Person (20, "Ivan"));
		people.add(new Person (72, "Stoyan"));
		people.add(new Person (51, "Georgi"));
		people.add(new Person (30, "Dragan"));
		people.add(new Person (33, "Dragan"));
		
		while(!people.isEmpty()) {
			System.out.println(people.poll());
		}
	}
}


class SortByAge implements Comparator<Person>
{
    // Used for sorting in ascending order of age
    public int compare(Person a, Person b)
    {
        return a.getAge() - b.getAge();
    }
}
 
class SortByName implements Comparator<Person>
{
    // Used for sorting in ascending order of name
    public int compare(Person a, Person b)
    {
        return a.getName().compareTo(b.getName());
    }
}

class PersonSortingComparator implements Comparator<Person> {
	 
    @Override
    public int compare(Person p1, Person p2) {

        int nameCompare = p1.getName().compareTo(p2.getName());
        int ageCompare = p1.getAge() - p2.getAge();

        
        if (nameCompare == 0) {
            return ((ageCompare == 0) ? nameCompare : ageCompare);
        } else {
            return nameCompare;
        }
    }
}