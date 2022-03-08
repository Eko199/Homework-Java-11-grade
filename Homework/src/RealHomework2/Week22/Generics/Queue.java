package RealHomework2.Week22.Generics;

import java.util.ArrayList;

public class Queue<T> {
    private ArrayList<T> elements = new ArrayList<>();

    public Queue() {}

    public void enqueue(T v) {
        elements.add(v);
    }

    public T dequeue() {
        T toReturn = elements.get(0);
        elements = new ArrayList<>(elements.subList(1, elements.size()));
        return toReturn;
    }

    public boolean empty() {
        return elements.isEmpty();
    }

    public int getSize() {
        return elements.size();
    }
}
