package com.javarush.task.pro.task05.task0507;

import java.util.Scanner;

/* 
Максимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();//напишите тут ваш код
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++){
            if (max < array[i]){
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
