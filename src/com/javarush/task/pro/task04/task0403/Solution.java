package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        //while (scanner.nextLine() != "Enter") {
        //   if (scanner.hasNextInt()) {
        while (scanner.hasNextInt()) {
            sum = sum + scanner.nextInt();
        }
       //
            System.out.println(sum);
        //напишите тут ваш код
    }
}