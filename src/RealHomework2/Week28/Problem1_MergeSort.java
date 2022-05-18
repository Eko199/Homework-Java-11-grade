package RealHomework2.Week28;

import java.util.Arrays;
import java.util.Comparator;

public class Problem1_MergeSort {
    public static void main(String[] args) {
        Integer[] arr1 = new Integer[] {5, 7, 3, 9, 0};
        Integer[] arr2 = new Integer[] {5, 7, 3, 9, 0};

        mergeSort(arr1);
        mergeSort(arr2, Integer::compareTo);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    public static <E extends Comparable<E>> void mergeSort(E[] list) {
        if (list.length > 1) {
            E[] firstHalf = Arrays.copyOf(list, list.length / 2);
            mergeSort(firstHalf);

            E[] secondHalf = Arrays.copyOfRange(list, list.length / 2, list.length);
            mergeSort(secondHalf);

            merge(firstHalf, secondHalf, list);
        }
    }

    public static <E extends  Comparable<E>> void merge(E[] list1, E[] list2, E[] list) {
        int current1 = 0;
        int current2 = 0;
        int current3 = 0;

        while (current1 < list1.length && current2 < list2.length) {
            if (list1[current1].compareTo(list2[current2]) < 0)
                list[current3++] = list1[current1++];
            else
                list[current3++] = list2[current2++];
        }

        while (current1 < list1.length)
            list[current3++] = list1[current1++];
        while (current2 < list2.length)
            list[current3++] = list2[current2++];
    }

    public static <E> void mergeSort(E[] list, Comparator<? super E> comparator) {
        if (list.length > 1) {
            E[] firstHalf = Arrays.copyOf(list, list.length / 2);
            mergeSort(firstHalf, comparator);

            E[] secondHalf = Arrays.copyOfRange(list, list.length / 2, list.length);
            mergeSort(secondHalf, comparator);

            merge(firstHalf, secondHalf, list, comparator);
        }
    }

    public static <E> void merge(E[] list1, E[] list2, E[] list, Comparator<? super E> comparator) {
        int current1 = 0;
        int current2 = 0;
        int current3 = 0;

        while (current1 < list1.length && current2 < list2.length) {
            if (comparator.compare(list1[current1], list2[current2]) < 0)
                list[current3++] = list1[current1++];
            else
                list[current3++] = list2[current2++];
        }

        while (current1 < list1.length)
            list[current3++] = list1[current1++];
        while (current2 < list2.length)
            list[current3++] = list2[current2++];
    }
}
