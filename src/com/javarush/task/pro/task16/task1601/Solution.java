package com.javarush.task.pro.task16.task1601;

import java.util.Date;

/* 
Лишь бы не в понедельник :)
*/

public class Solution {

    static Date birthDate = new Date(85, 2, 13);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        if (date.getDay() == 0) {
            return "Воскресенье";
        } else if (date.getDay() == 1) {
            return "Понедельник";
        } else if (date.getDay() == 2) {
            return "Вторник";
        } else if (date.getDay() == 3) {
            return "Среда";
        } else if (date.getDay() == 4) {
            return "Четверг";
        } else if (date.getDay() == 5) {
            return "Пятница";
        } else if (date.getDay() == 6) {
            return "Суббота";
        } else return null;
    }
}
