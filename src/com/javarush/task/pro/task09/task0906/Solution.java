package com.javarush.task.pro.task09.task0906;

import java.util.regex.Pattern;

/* 
Двоичный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        //int decimalNumber = Integer.MAX_VALUE;
        int decimalNumber = 9;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }
    public static String toBinary(int decimalNumber) {
        String binaryVal = "";
        if (decimalNumber <= 0) {
            return binaryVal;
        }
        while (decimalNumber > 0) {
            binaryVal = decimalNumber % 2 + binaryVal;
            decimalNumber = decimalNumber / 2;
            //напишите тут ваш код
        }
        return binaryVal;
    }
    public static int toDecimal(String binaryNumber) {
        int decimalVal = 0;
        if (binaryNumber == null){
            return decimalVal;
        }
        for (int i = 0; i < binaryNumber.length(); i++) {
            int index = binaryNumber.length() - 1 - i;
            int value = Character.getNumericValue(binaryNumber.charAt(index));
            decimalVal = decimalVal + value * (int) (Math.pow(2, i));
        }
        //напишите тут ваш код
        return decimalVal;
    }
}
