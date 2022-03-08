package RealHomework2.Week22.Generics;

import java.util.ArrayList;
import java.util.Collections;

public class Problem1 {
    public static <E> void shuffle(ArrayList<E> list) {
        for (int i = 0; i < list.size(); i++) {
            Collections.swap(list, (int)Math.round(Math.random() * (list.size() - 1)),
                    (int)Math.round(Math.random() * (list.size() - 1)));
        }
    }

    public static <E extends Comparable<E>> E min(ArrayList<E> list) {
        E min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (min.compareTo(list.get(i)) > 0)
                min = list.get(i);
        }
        return min;
    }

    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            ArrayList<E> sublist = new ArrayList<>(list.subList(i, list.size()));
            Collections.swap(list, i, list.indexOf(min(sublist)));
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++)
            list.add(i);

        shuffle(list);
        System.out.println(list);

        sort(list);
        System.out.println(list);

        System.out.println(min(list));
    }
}
