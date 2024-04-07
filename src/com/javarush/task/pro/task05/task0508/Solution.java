package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        strings = new String[6];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();//напишите тут ваш код
        }
        //String nullVal = null;
        for (int j = 0; j < strings.length; j++){
            String comparedVal = strings[j];
            for (int i = j+1; i < strings.length; i++) {
                if (strings[i] != null && strings[i].equals(comparedVal)) {
                    strings[i] = null;
                    strings[j] = null;
                }
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
