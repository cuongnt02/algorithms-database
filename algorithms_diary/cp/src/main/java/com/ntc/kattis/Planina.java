package com.ntc.kattis;

import java.util.Scanner;

public class Planina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println((int) Math.pow(Math.pow(2, i) + 1, 2));
    }
}
