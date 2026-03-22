package com.ntc.kattis;

import java.util.Arrays;
import java.util.Scanner;

public class TemperatureConfusion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] parts = sc.nextLine().split("/");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        int gcd = gcd(Math.abs((a - 32 * b) * 5), b * 9);
        System.out.println(((a - 32 * b) * 5) / gcd + "/" + (b * 9) / gcd);
    }

    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
