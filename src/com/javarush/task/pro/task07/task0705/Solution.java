package com.javarush.task.pro.task07.task0705;

/* 
Бесконечность не предел
*/

public class Solution {
    public static void main(String[] args) {
       double num1 = 1, num2 = -1, numDiv = 0;
       Solution.div(numDiv,num1);
       Solution.div(numDiv,num2);//напишите тут ваш код
    }

    public static void div(double a, double b){
        System.out.println(b/a);
    }
}
