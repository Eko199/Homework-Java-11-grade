package RealHomework2.Week22.StackAndQueue;

public class QueueOfIntegers {
    private int[] elements;
    private int size;

    public QueueOfIntegers() {
        elements = new int[8];
    }

    public void enqueue(int v) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = v;
    }

    public int dequeue() {
        int toReturn = elements[0];
        if (--size >= 0)
            System.arraycopy(elements, 1, elements, 0, size);
        return toReturn;
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}
