package com.Tema11;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter an ineger: ");
            arr[i] = sc.nextInt();
        }
        //shuffle
        for (int i = 0; i < Math.random() * 30; i++) {
            int x = (int)(Math.random() * 10), y = (int)(Math.random() * 10);
            int a = arr[x];
            arr[x] = arr[y];
            arr[y] = a;
        }

        System.out.println("Shuffled array: " + Arrays.toString(arr));
    }
}
