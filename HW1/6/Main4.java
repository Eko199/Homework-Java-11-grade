package com.company;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What year are you interested in?");
        int year = sc.nextInt();
        System.out.println("Which day of the week is January the first?");
        int weekDay = sc.nextInt();
        for (int i=0; i<12; i++) {
            String month = "";
            switch(i) {
                case 0:
                    month = "January";
                    break;
                case 1:
                    month = "February";
                    break;
                case 2:
                    month = "March";
                    break;
                case 3:
                    month = "April";
                    break;
                case 4:
                    month = "May";
                    break;
                case 5:
                    month = "June";
                    break;
                case 6:
                    month = "July";
                    break;
                case 7:
                    month = "August";
                    break;
                case 8:
                    month = "September";
                    break;
                case 9:
                    month = "October";
                    break;
                case 10:
                    month = "November";
                    break;
                case 11:
                    month = "December";
                    break;
                default:
                    System.out.println("What? How?");
                    break;
            }
            System.out.println("                    " + month);
            for (int j=0; j<50; j++) System.out.print('-');
            System.out.println();
        }
    }
}
