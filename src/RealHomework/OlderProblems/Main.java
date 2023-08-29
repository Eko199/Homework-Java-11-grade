package RealHomework.OlderProblems;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double height, width, length;
        // 1L - 30kv m - 4$
        // 5L - 140kv. m - 15$
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height: ");
        height = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter width: ");
        width = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter length: ");
        length = sc.nextDouble();
        sc.nextLine();
        double area = 2*(height*width + height*length) + length*width;
        int bigBucket, smallBucket;
        int ceilArea = (int)Math.ceil(area);
        bigBucket = ceilArea / 140;
        int leftArea = ceilArea - bigBucket * 140;
        if (leftArea > 100){

        }
    }
}
