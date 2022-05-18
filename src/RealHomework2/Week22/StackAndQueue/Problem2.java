package RealHomework2.Week22.StackAndQueue;

public class Problem2 {
    public static void main(String[] args) {
        QueueOfIntegers queue = new QueueOfIntegers();
        for (int i = 0; i < 20; i++)
            queue.enqueue(i);

        while (!queue.empty())
            System.out.println(queue.dequeue());
    }
}
