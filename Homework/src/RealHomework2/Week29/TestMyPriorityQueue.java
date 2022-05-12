package RealHomework2.Week29;

import RealHomework2.Week29.MyPriorityQueue;

public class TestMyPriorityQueue {

	public static void main(String[] args) {
		Patient patient1 = new Patient("John", 2);
		Patient patient2 = new Patient("Jim", 1);
		Patient patient3 = new Patient("Tim", 5);
		Patient patient4 = new Patient("Cindy", 7);
		
		MyPriorityQueue<Patient> priorityQueue = new MyPriorityQueue<Patient>();
		priorityQueue.enqueue(patient1);
		priorityQueue.enqueue(patient2);
		priorityQueue.enqueue(patient3);
		priorityQueue.enqueue(patient4);
		 
		while (priorityQueue.getSize() > 0)
			System.out.print(priorityQueue.dequeue() + " ");
	}
	
	//A static nested class may be instantiated without instantiating its outer class
	static class Patient implements Comparable<Patient> {
		private String name;
		private int priority;
		 
		public Patient(String name, int priority) {
			this.name = name;
			this.priority = priority;
		}
		
		@Override
		public String toString() {
			return name + "(priority:" + priority + ")";
		}
		
		@Override
		public int compareTo(Patient patient) {
			return this.priority - patient.priority;
		}
	}
}
