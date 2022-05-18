package RealHomework2.Week29;

import java.util.Comparator;

public class HeapSort {
	
	/** Heap sort method */
	public static <E extends Comparable<E>> void heapSort(E[] list) {
		// Create a Heap of integers
		Heap<E> heap = new Heap<>(list);
		
		// Remove elements from the heap
		for (int i = list.length - 1; i >= 0; i--)
			list[i] = heap.remove();
	}

	public static <E> void heapSort(E[] list, Comparator<? super E> comparator) {
		HeapComparator<E> heap = new HeapComparator<>(list, comparator);

		for (int i = list.length - 1; i >= 0; i--)
			list[i] = heap.remove();
	}
	
	/** A test method */
	public static void main(String[] args) {
		Integer[] list = {-44, -5, -3, 3, 3, 1, -4, 0, 1, 2, 4, 5, 53};
		heapSort(list);
		for (Integer integer : list) System.out.print(integer + " ");
		System.out.println();

		heapSort(list, (o1, o2) -> -Integer.compare(o1, o2));
		for (Integer integer : list) System.out.print(integer + " ");
	}

}
