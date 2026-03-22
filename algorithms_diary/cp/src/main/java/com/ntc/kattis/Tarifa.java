package com.ntc.kattis;

import java.util.Scanner;

public class Tarifa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, n, p, used = 0;
        x = sc.nextInt();
        n = sc.nextInt();
        while (n-- > 0) {
            p = sc.nextInt();
            used += (x - p);
        }
        System.out.println(used + x);
    }
}
