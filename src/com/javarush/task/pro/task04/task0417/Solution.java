package com.javarush.task.pro.task04.task0417;

import java.util.Scanner;

/* 
Скорость ветра
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rateMS = scanner.nextInt();
        int rateKMH = (int)(Math.round(rateMS * 3.6));
        System.out.println(rateKMH);//напишите тут ваш код

    }
}