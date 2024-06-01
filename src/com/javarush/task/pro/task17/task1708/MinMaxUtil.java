package com.javarush.task.pro.task17.task1708;

/* 
Минимальное и максимальное
*/

public class MinMaxUtil {
    public static int min(int val1, int val2) {
        return Math.min(val2, val1);
    }

    public static int min(int val1, int val2, int val3) {
        return Math.min(min(val1, val2), val3);
    }

    public static int min(int val1, int val2, int val3, int val4) {
        return Math.min(min(val1, val2, val3), val4);
    }

    public static int min(int val1, int val2, int val3, int val4, int val5) {
        return Math.min(min(val1, val2, val3, val4), val5);
    }

    public static int max(int val1, int val2) {
        return Math.max(val2, val1);
    }

    public static int max(int val1, int val2, int val3) {
        return Math.max(max(val1, val2), val3);
    }

    public static int max(int val1, int val2, int val3, int val4) {
        return Math.max(max(val1, val2, val3), val4);
    }

    public static int max(int val1, int val2, int val3, int val4, int val5) {
        return Math.max(max(val1, val2, val3, val4), val5);
    }
}
