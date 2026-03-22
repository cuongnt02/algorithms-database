package com.ntc.kattis;

import java.util.Scanner;

public class ProvincesAndGold {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int g = sc.nextInt(), s = sc.nextInt(), c = sc.nextInt();
        String victory = "";
        String treasure;
        int total = g*3 + s*2 + c;
        if (total >= 8) {
            victory = "Province";
        } else if (total >= 5) {
            victory = "Duchy";
        } else if (total >= 2) {
            victory = "Estate";
        }
        if (total >= 6) {
            treasure = "Gold";
        } else if (total >= 3) {
            treasure = "Silver";
        } else {
            treasure = "Copper";
        }
        System.out.println(victory.isEmpty() ? treasure : (victory + " or ") + treasure);
    }
}
