package RealHomework2.Week27;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GoogleInterview {
    public static void main(String[] args) {
        int[] arr = new int[] {1, -1, 99, 69, 15, 13 };
        int[] sortedArr = Arrays.stream(arr).sorted().toArray();
        int sum = 100;

        System.out.println(hasPairLoops(arr, sum));
        System.out.println(hasPairBinarySearch(sortedArr, sum));
        System.out.println(hasPairSorted(sortedArr, sum));
        System.out.println(hasPairSet(arr, sum));
    }

    public static boolean hasPairLoops(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum)
                    return true;
            }
        }

        return false;
    }

    public static boolean hasPairBinarySearch(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            if (binarySearch(arr, sum - arr[i], i+1, arr.length - 1) > 0)
                return true;
        }

        return false;
    }

    public static int binarySearch(int[] arr, int x, int start, int end) {
        if (end >= start) {
            int mid = (end + start) / 2;

            if (arr[mid] == x)
                return mid;
            if (arr[mid] < x)
                return binarySearch(arr, x, mid + 1, end);

            return binarySearch(arr, x, start, mid - 1);
        }

        return -1;
    }

    public static boolean hasPairSorted(int[] arr, int sum) {
        int start = 0;
        int end = arr.length - 1;

        while (end > start) {
            int s = arr[start] + arr[end];
            if (s == sum)
                return true;
            if (s > sum)
                end--;
            else
                start++;
        }

        return false;
    }

    public static boolean hasPairSet(int[] arr, int sum) {
        Set<Integer> pastElements = new HashSet<>();

        for (int element : arr) {
            if (pastElements.contains(sum - element))
                return true;

            pastElements.add(element);
        }

        return false;
    }
}
