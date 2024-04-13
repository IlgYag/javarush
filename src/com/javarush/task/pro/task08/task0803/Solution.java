package com.javarush.task.pro.task08.task0803;

import java.util.Scanner;

/* 
Минимальный элемент массива
*/

public class Solution {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        int minVal = ints[0];
        for (int val: ints) {
            minVal = Math.min(minVal, val);//напишите тут ваш код
        }//напишите тут ваш код
        return minVal;
    }

    public static int[] getArrayOfTenElements() {
        Scanner console = new Scanner(System.in);
        int[] arrayOf10El = new int[10];
        for (int i = 0; i < arrayOf10El.length; i++) {
            arrayOf10El[i] = console.nextInt();//напишите тут ваш код
        }
        return arrayOf10El;
    }
}
