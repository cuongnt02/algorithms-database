package com.ntc.kattis;

import java.util.Scanner;

public class JudgingMoose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(l + r == 0 ? "Not a moose" : (l - r) == 0 ? "Even " + (l + r) : "Odd " + (l + (r + Math.abs(l - r))));
    }
}
