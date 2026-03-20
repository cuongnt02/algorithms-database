package com.ntc.practice;

import java.util.Arrays;
import java.util.Scanner;

public class SearchProblem {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        if (Arrays.binarySearch(a, value) >=0) {
            System.out.println("Value " + value + " exist in array.");
        } else {
            System.out.println("Value " + value + " not exist in array");
        }
    }
}
