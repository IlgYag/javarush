package com.javarush.task.pro.task16.task1607;

import java.time.LocalDate;
import java.time.Month;

/* 
Освоение нового API
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    static LocalDate nowExample() {
        return LocalDate.now();
    }

    static LocalDate ofExample() {
        return LocalDate.of(2020, Month.SEPTEMBER, 12);
    }

    static LocalDate ofYearDayExample() {
        int dayOfYear = LocalDate.of(2020, Month.SEPTEMBER, 12).getDayOfYear();
        return LocalDate.ofYearDay(2020, dayOfYear);
    }

    static LocalDate ofEpochDayExample() {
        long epochDay = LocalDate.of(2020, Month.SEPTEMBER, 12).toEpochDay();
        return LocalDate.ofEpochDay(epochDay);
    }
}
