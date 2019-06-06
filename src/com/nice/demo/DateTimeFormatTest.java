package com.nice.demo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author ningh
 */
public class DateTimeFormatTest {
    public static void main(String[] args) {
        DateTimeFormatter newFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate date2 = LocalDate.now();
        System.out.println(date2.format(newFormatter));
    }
}
