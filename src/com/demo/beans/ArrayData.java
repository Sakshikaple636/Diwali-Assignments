package com.demo.beans;

import java.util.Scanner;

public class ArrayData {

    // Method to input array from user
    public static int[] inputArray(String arrayName) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of " + arrayName + ": ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements of " + arrayName + " in sorted order:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
