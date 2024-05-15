
package com.javarush.task.pro.task13.task1321;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getTranslationForDayOfWeek("Вторник"));
        System.out.println(getTranslationForDayOfWeek("Пятница"));
        System.out.println(getTranslationForDayOfWeek("Высплюсенье"));
    }

    public static String getTranslationForDayOfWeek(String ru) {
        String en;
        if (ru.toLowerCase().equalsIgnoreCase("понедельник")) {
            en = "Monday";
        } else if (ru.toLowerCase().equalsIgnoreCase("вторник")) {
            en = "Tuesday";
        } else if (ru.toLowerCase().equalsIgnoreCase("среда")) {
            en = "Wednesday";
        } else if (ru.toLowerCase().equalsIgnoreCase("четверг")) {
            en = "Thursday";
        } else if (ru.toLowerCase().equalsIgnoreCase("пятница")) {
            en = "Friday";
        } else if (ru.toLowerCase().equalsIgnoreCase("суббота")) {
            en = "Saturday";
        } else if (ru.toLowerCase().equalsIgnoreCase("воскресенье")) {
            en = "Sunday";
        } else {
            en = "Недействительный день недели";
        }
        return en;
    }
}
