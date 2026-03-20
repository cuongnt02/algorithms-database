package com.ntc.uva;

import java.util.Scanner;

class BackToHighSchoolPhysics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v, t;
        while (sc.hasNext()) {
            v = sc.nextInt(); t = sc.nextInt();
            System.out.println(v*t*2);
        }

    }
}
