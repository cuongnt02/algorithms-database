package com.ntc.uva;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class BackToThePast {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2013, Month.MAY, 29);
        System.out.println(date.format(DateTimeFormatter.ofPattern("MMMM dd, yyyy EEEE")));
    }
}
