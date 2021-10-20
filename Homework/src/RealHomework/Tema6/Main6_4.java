package RealHomework.Tema6;
import java.util.Scanner;

public class Main6_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What year are you interested in?");
        int year = sc.nextInt();
        System.out.println("Which day of the week is January the first?");
        int weekDay = sc.nextInt();
        for (int i=0; i<12; i++) {
            String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
            String month = months[i];
            System.out.println("                    " + month);
            for (int j=0; j<51; j++) System.out.print('-');
            System.out.println();
            String[] weekDays = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
            for (int j=0; j<7; j++) {
                System.out.print(weekDays[j] + " \t");
            }
            System.out.println();
            int lastDay;
            switch (i+1) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    lastDay = 31;
                    break;
                case 2:
                    lastDay = 28;
                    if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                        lastDay = 29;
                    }
                    break;
                default:
                    lastDay = 30;
                    break;
            }
            for (int j=1; j<weekDay; j++)  System.out.print(" \t\t");
            for (int j=1; j<=lastDay; j++) {
                System.out.print(j + " \t\t");
                if (weekDay == 7) {
                    System.out.println();
                    weekDay = 1;
                } else weekDay++;
            }
            System.out.println();
            System.out.println();
        }
    }
}
