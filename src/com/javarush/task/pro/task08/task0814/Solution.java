package com.javarush.task.pro.task08.task0814;

/* 
Флаги
*/

public class Solution {

    public static int setFlag(int number, int flagPos) {
        int result = number | (1 << flagPos);//напишите тут ваш код
        return result;
    }

    public static int resetFlag(int number, int flagPos) {
        int result = number & ~(1 << flagPos);//напишите тут ваш код//напишите тут ваш код
        return result;
    }

    public static boolean checkFlag(int number, int flagPos) {
        boolean result = (number & (1 << flagPos)) == (1 << flagPos);//напишите тут ваш код
        return result;
    }
}
