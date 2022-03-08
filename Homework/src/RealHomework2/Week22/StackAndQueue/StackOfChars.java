package RealHomework2.Week22.StackAndQueue;

public class StackOfChars {
    private char[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 16;

    public StackOfChars() {
        this(DEFAULT_CAPACITY);
    }

    public StackOfChars(int capacity) {
        elements = new char[capacity];
    }

    public void push(char value) {
        if (size >= elements.length) {
            char[] temp = new char[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }

    public char pop() {
        return elements[--size];
    }

    public char peek() {
        return elements[size - 1];
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}
