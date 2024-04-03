package com.javarush.task.pro.task03.task0306;

import java.util.Scanner;

/* 
Треугольник
*/

public class Solution {
    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edge1 = scanner.nextInt();
        int edge2 = scanner.nextInt();
        int edge3 = scanner.nextInt();
        if (edge1 < edge2 + edge3 && edge2 < edge1 + edge3 && edge3 < edge1 + edge2) {
            System.out.println(TRIANGLE_EXISTS);
        }
        else {
            System.out.println(TRIANGLE_NOT_EXISTS);
        }//напишите тут ваш код
    }
}
