package com.ntc.kattis;

import java.util.Scanner;

public class IsItHalloween {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String m = sc.next();
        int d = sc.nextInt();
        System.out.println(((m.equals("OCT") && (d == 31)) || ((m.equals("DEC")) && (d == 25))) ? "yup" : "nope");
    }
}
