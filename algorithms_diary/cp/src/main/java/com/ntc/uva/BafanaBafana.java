package com.ntc.uva;

import java.util.Scanner;

public class BafanaBafana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        int n,k,p;
        for (int i = 1; i <= TC; i++) {
            n = sc.nextInt();k = sc.nextInt();p=sc.nextInt();
            while (p-- > 0) k = (k % n) + 1;
            System.out.println("Case " + i + ": " + k);
        }
    }
}
