package com.ntc.uva;

import java.util.Scanner;

public class AutomaticAnswer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TC, n;
        TC = sc.nextInt();
        while (TC-- > 0) {
            n = sc.nextInt();
            System.out.println(Math.abs((((n * 567 / 9) + 7492) * 235 / 47 - 498) / 10 % 10));
        }
    }
}
