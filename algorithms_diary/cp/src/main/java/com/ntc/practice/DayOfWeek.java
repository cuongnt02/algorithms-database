package com.ntc.practice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class DayOfWeek {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate date = LocalDate.of(2002, Calendar.NOVEMBER, 3);
        System.out.println(date.getDayOfWeek());
        System.out.println(date.until(now, ChronoUnit.DAYS) + " days(s) ago");
    }
}
