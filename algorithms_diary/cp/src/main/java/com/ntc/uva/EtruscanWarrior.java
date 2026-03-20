package com.ntc.uva;

import java.util.Scanner;

class EtruscanWarrior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n; int TC;
        TC = sc.nextInt();
        while (TC-- > 0) {
            n = sc.nextLong();
            long rows = Math.round(-1 + Math.sqrt(1 + 4*2*n) /  2);
            System.out.println(rows);
        }
    }
}
