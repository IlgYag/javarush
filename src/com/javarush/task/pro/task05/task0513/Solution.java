package com.javarush.task.pro.task05.task0513;

import java.util.Arrays;

/* 
Выводим массивы
*/

public class Solution {

    public static String[] strings = new String[]{"I", "love", "Java"};
    public static int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

    public static void main(String[] args) {
       String s1 = Arrays.toString(strings);
       String s2 = Arrays.toString(ints);
        System.out.println(s1);
        System.out.println(s2);//напишите тут ваш код
    }
}
