package com.javarush.task.pro.task13.task1319;

/* 
Месяцы в сезоне
*/

import java.util.List;

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static Month[] getWinterMonths() {
        Month[] winterMonList = {DECEMBER, JANUARY, FEBRUARY};
        return winterMonList;
    }

    public static Month[] getSpringMonths() {
        Month[] springMonList = {MARCH, APRIL, MAY};
        return springMonList;
    }

    public static Month[] getSummerMonths() {
        Month[] summerMonList = {JUNE, JULY, AUGUST};
        return summerMonList;
    }
    public static Month[] getAutumnMonths() {
        Month[] autumnMonList = {SEPTEMBER, OCTOBER, NOVEMBER};
        return autumnMonList;
    }
}
