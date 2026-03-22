package com.ntc.uva;

import java.util.Scanner;

public class Hasmat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a, b;
        while (sc.hasNext()) {
            a = sc.nextLong();
            b = sc.nextLong();
            System.out.println(Math.abs(b - a));
        }
    }
}
