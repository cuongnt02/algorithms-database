package com.ntc.practice;

import java.util.Scanner;

public class PINumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = Math.PI;
        int n = sc.nextInt();
        String format = "%." + n + "f";
        System.out.printf(format, pi);
    }
}
