package com.javarush.task.pro.task04.task0408;

import java.util.Scanner;

/* 
Максимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxVal = Integer.MIN_VALUE;
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num % 2 == 0 && num > maxVal) {
                maxVal = num;//напишите тут ваш код
            }
        }
        System.out.println(maxVal);
    }
}