package RealHomework2.Week24.Implementation_of_queue_with_linked_list;

public class TestGenericQueue {
	public static void main(String[] args) {
		
		GenericQueue<String> queue = new GenericQueue<>();
		
		queue.enqueue("Tom");
		System.out.println("(1) " + queue);
		
		queue.enqueue("Susan"); 
		System.out.println("(2) " + queue);
		
		queue.enqueue("Kim");
		queue.enqueue("Michael");
		System.out.println("(3) " + queue);
		
		
		System.out.println("(4) " + queue.dequeue());
		System.out.println("(5) " + queue.dequeue());
		System.out.println("(6) " + queue);
	}

}
