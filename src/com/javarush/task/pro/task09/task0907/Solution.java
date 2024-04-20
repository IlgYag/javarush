package com.javarush.task.pro.task09.task0907;

import java.util.regex.Pattern;

/* 
Шестнадцатеричный конвертер
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        String result = "";
        if (decimalNumber <= 0) {
            return result;//напишите тут ваш код
        }
        while (decimalNumber != 0) {
            int index = decimalNumber % 16;
            result = HEX.charAt(index) + result;
            decimalNumber = decimalNumber / 16;
        }
        return result;
    }

    public static int toDecimal(String hexNumber) {
        int result = 0;
        if (hexNumber == null) {
            return result;
        }
        for (int i = 0; i < hexNumber.length(); i++) {
            int index = HEX.indexOf(hexNumber.charAt(i));
            result = 16 * result + index;//напишите тут ваш код
        }
        return result;
    }
}
