package com.javarush.task.pro.task05.task0506;

import java.util.Scanner;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = console.nextInt(); //напишите тут ваш код
        }
        int min = array[0];
        for (int i = 1; i < n; i++){
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
