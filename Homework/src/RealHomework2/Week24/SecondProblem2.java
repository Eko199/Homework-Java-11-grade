package RealHomework2.Week24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class SecondProblem2 {
    public static void main(String[] args) {
        PriorityQueue<String> queue1 = new PriorityQueue<>();
        queue1.addAll(Arrays.stream(new String[] { "George" , "Jim" , "John" , "Blake" , "Kevin" , "Michael" }).toList());

        PriorityQueue<String> queue2 = new PriorityQueue<>();
        queue2.addAll(Arrays.stream(new String[] { "George" , "Katie" , "Kevin" , "Michelle" , "Ryan" }).toList());

        ArrayList<String> intersection = new ArrayList<>();
        ArrayList<String> difference = new ArrayList<>();
        PriorityQueue<String> biggerQueue = (queue1.peek().compareTo(queue2.peek()) < 0) ? queue1 : queue2;
        PriorityQueue<String> smallerQueue = (queue1.peek().compareTo(queue2.peek()) < 0) ? queue2 : queue1;

        while (!biggerQueue.isEmpty() && !smallerQueue.isEmpty()) {
            if (biggerQueue.peek().equals(smallerQueue.peek())) {
                intersection.add(biggerQueue.poll());
                smallerQueue.poll();
            } else if (biggerQueue.peek().compareTo(smallerQueue.peek()) > 0) {
                difference.add(smallerQueue.poll());
            } else {
                difference.add(biggerQueue.poll());
            }
        }
        difference.addAll(biggerQueue);
        difference.addAll(smallerQueue);

        ArrayList<String> union = (ArrayList<String>) intersection.clone();
        union.addAll(difference);

        System.out.println("Intersection: " + intersection);
        System.out.println("Difference: " + difference);
        System.out.println("Union: " + union);
    }
}
