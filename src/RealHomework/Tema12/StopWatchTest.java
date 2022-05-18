package RealHomework.Tema12;

public class StopWatchTest {
    static void swap(double[] arr, int i, int j) {
        double x = arr[i];
        arr[i] = arr[j];
        arr[j] = x;
    }

    public static void main(String[] args) throws Exception {
        double[] arr = new double[100000];
        for (int i = 0; i < 100000; i++)
            arr[i] = Math.random() * 100000;

        StopWatch stopWatch = new StopWatch();

        for (int i = 0; i < 100000; i++) {
            int minIndex = i;
            for (int j = i+1; j < 100000; j++) {
                if (arr[j] < arr[minIndex]) minIndex = j;
            }
            swap(arr, minIndex, i);
        }

        stopWatch.stop();

        for (int i = 0; i < 100000; i++)
            System.out.println(arr[i]);

        System.out.println("The sorting took " + stopWatch.getElapsedTime() + " milliseconds.");
    }
}
