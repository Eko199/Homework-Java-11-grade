package RealHomework2.Week24.Implementation_of_queue_with_linked_list;

public class GenericQueue<E> {
	private java.util.LinkedList<E> list = new java.util.LinkedList<>();
	 
	public void enqueue(E e) {
		list.addLast(e);
	}
	
	public E dequeue() {
		return list.removeFirst();
	}
	
	public int getSize() {
		return list.size();
	}
	
	@Override
	public String toString() {
		return "Queue: " + list.toString();
	}
}