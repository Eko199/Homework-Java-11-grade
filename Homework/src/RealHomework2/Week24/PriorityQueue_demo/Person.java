package RealHomework2.Week24.PriorityQueue_demo;

public class Person implements Comparable<Person> {
	private int age;
	private String name;

	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String toString() {
		return this.name + " " + this.age;
	}

	@Override
	public int compareTo(Person o) {
		if (this.age > o.age) return 1;
		if (this.age < o.age) return -1;
		return 0;
	}
}
