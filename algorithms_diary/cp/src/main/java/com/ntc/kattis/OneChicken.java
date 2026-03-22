package com.ntc.kattis;

import java.util.Scanner;

public class OneChicken {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, p;
        n = sc.nextInt();
        p = sc.nextInt();
        String plural = Math.abs(p - n) != 1 ? "s" : "";
        if (p - n > 0) {
            System.out.println("Dr. Chaz will have " + (p - n) + " piece" + plural + " of chicken left over!");
        } else {
            System.out.println("Dr. Chaz needs " + (n - p) + " more piece" + plural + " of chicken!");
        }
    }
}
