package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Иванов Иван", 3.22);
        grades.put("Петров Иван", 4.01);
        grades.put("Клюшкин Иван", 3.9);
        grades.put("Кроваткин Василий", 3.45);
        grades.put("Укатов Прохор", 4.67);
        //напишите тут ваш код
    }
}
