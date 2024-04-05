package com.javarush.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Стакан наполовину пуст или наполовину полон?
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean optim = scanner.nextBoolean();
        double glass = 0.5;


        if (optim) {
            int rezOpt = (int) (Math.ceil(glass));
            System.out.println(rezOpt);//напишите тут ваш код
        } else if (!optim) {
            int rezPess = (int) (Math.floor(glass));
            System.out.println(rezPess);
        }

    }
}