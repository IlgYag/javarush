package com.javarush.task.pro.task09.task0908;

import java.util.regex.Pattern;

/* 
Двоично-шестнадцатеричный конвертер
*/

public class Solution {

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        String result = "";
        if (binaryNumber == null || binaryNumber.indexOf('0') < 0 || binaryNumber.indexOf('1') < 0) {
            return result;//напишите тут ваш код
        }
        if (binaryNumber.length() % 4 != 0) {
            for (int i = 0; i < binaryNumber.length() % 4; i++) {
                binaryNumber = "0" + binaryNumber;
            }
        }

        for (int i = 0; i < binaryNumber.length() / 4; i++) {
            int hex = 0;
            for (int j = 0; j < 4; j++) {
                String strVal = String.valueOf(binaryNumber.charAt(i * 4 + j));
                int val = Integer.valueOf(strVal);
                hex = (int) (val * Math.pow(2, 3 - j)) + hex;
            }
            if (hex == 10) {
                result = result + "a";
            } else if (hex == 11) {
                result = result + "b";
            } else if (hex == 12) {
                result = result + "c";
            } else if (hex == 13) {
                result = result + "d";
            } else if (hex == 14) {
                result = result + "e";
            } else if (hex == 15) {
                result = result + "f";
            } else {
                result = result + hex;
            }
        }
        return result;
    }

    public static String toBinary(String hexNumber) {
        String result = "";
        if (hexNumber == null) {
            return result;//напишите тут ваш код
        }
        return null;
    }
}
