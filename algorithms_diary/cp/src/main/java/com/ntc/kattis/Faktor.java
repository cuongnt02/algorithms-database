package com.ntc.kattis;

import java.util.Scanner;

public class Faktor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, i;
        a = sc.nextInt();
        i = sc.nextInt();
        System.out.println((int) Math.ceil(a * (i - 0.9999999)));
    }
}
