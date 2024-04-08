package com.javarush.task.pro.task05.task0516;

import java.util.Arrays;

/* 
Заполняем массив
*/

public class Solution {

    public static int[] array = new int[20];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        int endVal = array.length / 2 + (1 * array.length % 2);
        Arrays.fill(array, 0, endVal, valueStart);
        Arrays.fill(array, endVal, array.length, valueEnd);//напишите тут ваш код
        System.out.println(Arrays.toString(array));
    }
}
