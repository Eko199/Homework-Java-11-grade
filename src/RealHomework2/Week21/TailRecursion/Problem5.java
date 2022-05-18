package RealHomework2.Week21.TailRecursion;

public class Problem5 {
    public static double average(int[] arr) {
        return average(arr, arr.length, 0);
    }

    private static double average(int[] arr, int size, int sum) {
        if (size == 0)
            return 1.0 * sum / arr.length;
        return average(arr, size-1, sum + arr[size-1]);
    }

    public static void main(String[] args) {
        System.out.println(average(new int[] {1, 2, 6}));
    }
}
