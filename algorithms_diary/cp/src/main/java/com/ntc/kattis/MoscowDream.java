package com.ntc.kattis;

import java.util.Scanner;

public class MoscowDream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, n;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        n = sc.nextInt();
        System.out.println(((a >= 1) && (b >= 1) && (c >= 1) && (a + b + c >= n) && (n >= 3)) ? "YES" : "NO");

    }
}
