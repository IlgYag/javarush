package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num < min1) {
                min2 = min1;
                min1 = num;//напишите тут ваш код
            }
            else if (num > min1 && num < min2) {
            min2 =num;
            }
        }
        System.out.println(min2);
    }
}