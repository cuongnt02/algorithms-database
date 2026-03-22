package com.ntc.kattis;

import java.util.Scanner;

public class TimeTravelingTemperatures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (y == 1) {
            if (x == 0) System.out.println("ALL GOOD");
            else System.out.println("IMPOSSIBLE");
        } else {
            if (x % (1-y) == 0) System.out.println(x / (1-y));
            else System.out.printf("%.9f", x / (1.0-y));
        }
    }
}
