package com.javarush.task.pro.task03.task0311;

import java.util.Scanner;

/* 
Высокая точность
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        //напишите тут ваш код
        if (Math.abs(num1 - num2) < 0.000001) {
            System.out.println("числа равны");
        }
        else {//напишите тут ваш код
            System.out.println("числа не равны");
        }
    }
}
