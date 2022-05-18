package RealHomework2.Week22.Generics;

public class Problem2 {
    public static void main(String[] args) {
        Queue<Double> queue = new Queue<>();
        for (int i = 0; i < 20; i++)
            queue.enqueue(i * 1.0);

        while (!queue.empty())
            System.out.println(queue.dequeue());

        System.out.println(queue.getSize());
    }
}
