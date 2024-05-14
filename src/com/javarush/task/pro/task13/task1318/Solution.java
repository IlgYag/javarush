package com.javarush.task.pro.task13.task1318;

/* 
Следующий месяц, пожалуйста
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
        System.out.println(getNextMonth(Month.DECEMBER));
    }

    public static Month getNextMonth(Month month) {
        int nextMonthIndex = month == Month.DECEMBER ? 0 : month.ordinal()+1;
//        if (nextMonthIndex == Month.values().length - 1) {
//            nextMonthIndex = -1;
//        }
        return Month.values()[nextMonthIndex];//напишите тут ваш код
    }
}
