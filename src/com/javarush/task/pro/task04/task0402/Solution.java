package com.javarush.task.pro.task04.task0402;

import java.util.Scanner;

/* 
Все любят Мамбу
*/

public class Solution {
    public static void main(String[] args) {
        String text = " любит меня.";
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int num = 0;
        while (num < 10) {
            System.out.println(name + text);
            num++;//напишите тут ваш код
        }

    }
}
