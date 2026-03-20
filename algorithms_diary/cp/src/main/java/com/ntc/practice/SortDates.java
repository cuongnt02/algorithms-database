package com.ntc.practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class SortDates {
    public static void main(String[] args) {
        List<LocalDate> dates = new ArrayList<LocalDate>(
                Arrays.asList(
                        LocalDate.of(1980, Calendar.MAY, 24),
                        LocalDate.of(1982, Calendar.MAY, 24),
                        LocalDate.of(1983, Calendar.NOVEMBER, 13)
                )
        );
        dates.sort(Comparator.comparingInt(LocalDate::getMonthValue).thenComparingInt(LocalDate::getDayOfMonth).thenComparingInt((d) -> -d.getYear()));
        dates.forEach(date -> {
            System.out.println(date.format(DateTimeFormatter.ofPattern("dd MM yyyy")));
        });
    }
}
