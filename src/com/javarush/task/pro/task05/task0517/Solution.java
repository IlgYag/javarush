package com.javarush.task.pro.task05.task0517;

import java.util.Arrays;

/* 
Делим массив
*/

public class Solution {

    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public static void main(String[] args) {
        int arrLength = array.length / 2;
        result[1] = new int[arrLength];
        result[0] = new int[array.length - arrLength];
        result[0] = Arrays.copyOfRange(array, 0, array.length - arrLength);
        result[1] = Arrays.copyOfRange(array, array.length - arrLength, array.length);
        //напишите тут ваш код
        System.out.println(Arrays.deepToString(result));
    }
}
