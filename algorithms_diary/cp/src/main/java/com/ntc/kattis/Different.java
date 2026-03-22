package com.ntc.kattis;

import java.util.Scanner;

public class Different {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a, b;
        while (sc.hasNext()) {
            a = sc.nextLong();
            b = sc.nextLong();
            System.out.println(Math.abs(a - b));
        }
    }
}
