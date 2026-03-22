package com.ntc.kattis;

import java.util.Scanner;

public class Qaly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        float q, y;
        n = sc.nextInt();
        float qaly = 0;
        while(n-- > 0) {
            q = sc.nextFloat();
            y = sc.nextFloat();
            qaly += q*y;
        }
        System.out.printf("%.3f", qaly);
    }
}
