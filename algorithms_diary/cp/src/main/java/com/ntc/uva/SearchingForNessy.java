package com.ntc.uva;

import java.util.Scanner;

public class SearchingForNessy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TC, n, m;
        TC = sc.nextInt();
        while (TC-- > 0) {
            n = sc.nextInt();
            m = sc.nextInt();
            System.out.println(((n / 3)) * ((m / 3)));
        }
    }
}
