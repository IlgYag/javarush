package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        int imin = 0, jmin = 0, j = 0, imax = 19, jmax = 9;
        while (j <= jmax) {
            int i = imin;
            while (i <= imax) {
                if (j == jmin || j == jmax || i == imin || i == imax) {
                    System.out.print("Б");//напишите тут ваш код
                } else {
                    System.out.print(" ");
                }
                i++;
            }
            System.out.println();
            j++;
        }

    }
}