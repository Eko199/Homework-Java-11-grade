package RealHomework.Tema5;
import java.util.Scanner;

public class Main5_1 {
    //BucketCalculator
    public static void main(String[] args) {
        //1L - 30m^2  - $4
        //5L - 140m^2 - $15
        double height, width, length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        length = sc.nextDouble();
        System.out.println("Enter width: ");
        width = sc.nextDouble();
        System.out.println("Enter height: ");
        height = sc.nextDouble();

        double area = 2*height*(width + length) + width*length;
        System.out.println("Area to be painted: " + area + "sq.m.");
        int bigBuckets, smallBuckets;
        bigBuckets = (int)area/140;
        smallBuckets = (area%140%30 == 0) ? (int)area%140/30 : (int)area%140/30+1;
        //4 small buckets arent value
        if (smallBuckets >= 4) {
            smallBuckets = 0;
            bigBuckets++;
        }

        System.out.println("You need " + bigBuckets + " big buckets and " + smallBuckets + " small buckets");
        double price = bigBuckets * 15 + smallBuckets * 4;
        System.out.println("Price to be paid: $" + price);
    }
}
