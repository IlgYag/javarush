package com.javarush.task.pro.task04.task0407;

/* 
Сумма чисел, не кратных 3
*/

public class Solution {
    public static void main(String[] args) {
        int i = 0;
        int rez = 0;
        while (i < 100) {
            i++;
            if (i % 3 == 0) {
                continue; //напишите тут ваш код
            }
            else {
                rez = rez + i;
            }
        }
        System.out.println(rez);
    }
}