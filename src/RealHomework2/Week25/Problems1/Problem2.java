package RealHomework2.Week25.Problems1;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Problem2 {
    public  static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int m = scanner.nextInt();

        List<ArrayList<Integer>> queuesProductsArr = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            queuesProductsArr.add(new ArrayList<>()); //add all empty queues
            queuesProductsArr.get(i).add(i); //first element is the queue's index
            for (int j = 1; j <= k; j++) {
                queuesProductsArr.get(i).add(0);
            }
        }

        PriorityQueue<ArrayList<Integer>> queuesProductsPriority = new PriorityQueue<>(new QueueComparator());
        queuesProductsPriority.addAll(queuesProductsArr);

        int currentProducts = 1;
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> bestQueue = queuesProductsPriority.poll();
            bestQueue.set(currentProducts, bestQueue.get(currentProducts) + 1);
            queuesProductsPriority.offer(bestQueue);

            currentProducts = (currentProducts == k) ? 1 : currentProducts + 1;
        }

        queuesProductsArr = queuesProductsPriority.stream().sorted(new QueueComparatorByIndex()).toList();
        queuesProductsArr.forEach(queue -> {
            queue.stream().skip(1).forEach(clients -> System.out.printf("%3d", clients));
            System.out.println();
        });
    }
}

class QueueComparator implements Comparator<ArrayList<Integer>> {
    @Override
    public int compare(ArrayList<Integer> queue1, ArrayList<Integer> queue2) {
        AtomicInteger i = new AtomicInteger(0);
        int queue1Products = queue1.stream().skip(1).mapToInt(products -> products * i.incrementAndGet()).sum();
        i.set(0);
        int queue2Products = queue2.stream().skip(1).mapToInt(products -> products * i.incrementAndGet()).sum();

        if (queue1Products > queue2Products)
            return 1;
        else if (queue1Products < queue2Products)
            return -1;

        //if equal, check indexes
        if (queue1.get(0) > queue2.get(0))
            return 1;
        else if (queue1.get(0) < queue2.get(0))
            return -1;

        return 0;
    }
}

class QueueComparatorByIndex implements Comparator<ArrayList<Integer>> {
    @Override
    public int compare(ArrayList<Integer> queue1, ArrayList<Integer> queue2) {
        if (queue1.get(0) > queue2.get(0))
            return 1;
        else if (queue1.get(0) < queue2.get(0))
            return -1;

        return 0;
    }
}
