package com.javarush.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Стакан наполовину пуст или наполовину полон?
*/

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        Scanner scanner = new Scanner(System.in);
        boolean optim = scanner.nextBoolean();


        if (optim) {
            int rezOpt = (int) (Math.ceil(glass));
            System.out.println(rezOpt);//напишите тут ваш код
        } else {
            int rezPess = (int) (Math.floor(glass));
            System.out.println(rezPess);
        }

    }
}