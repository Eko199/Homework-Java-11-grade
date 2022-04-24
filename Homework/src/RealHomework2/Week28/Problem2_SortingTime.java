package RealHomework2.Week28;

import java.util.Arrays;

public class Problem2_SortingTime {
    public static void main(String[] args) {
        int[][] arrs = new int[6][];
        arrs[5] = new int[300000];

        for (int i = 0; i < 300000; i++)
            arrs[5][i] = (int) (Math.random() * 300000);

        for (int i = 0; i < 5; i++)
            arrs[i] = Arrays.copyOf(arrs[5], 50000 * (i+1));

        System.out.println("Array size\t|\tSelection Sort\t\tBubble Sort\t\tMerge Sort\t\tQuick Sort");
        for (int[] arr : arrs) {
            System.out.printf("%10d\t|\t%11d ms\t\t%8d ms\t\t%7d ms\t\t%7d ms\n", arr.length,
                    selectionSortTime(arr), bubbleSortTime(arr), mergeSortTime(arr), quickSortTime(arr));
        }
    }

    public static long selectionSortTime(int[] arr) {
        long start = System.currentTimeMillis();
        SelectionSort.selectionSort(arr.clone());
        return System.currentTimeMillis() - start;
    }

    public static long bubbleSortTime(int[] arr) {
        long start = System.currentTimeMillis();
        BubbleSort.bubbleSort(arr.clone());
        return System.currentTimeMillis() - start;
    }

    public static long mergeSortTime(int[] arr) {
        long start = System.currentTimeMillis();
        MergeSort.mergeSort(arr.clone());
        return System.currentTimeMillis() - start;
    }

    public static long quickSortTime(int[] arr) {
        long start = System.currentTimeMillis();
        QuickSort.quickSort(arr.clone());
        return System.currentTimeMillis() - start;
    }
}
