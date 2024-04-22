package com.javarush.task.pro.task09.task0908;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.regex.Pattern;

/* 
Двоично-шестнадцатеричный конвертер
*/

public class Solution {
    public static final String[] BIN = new String[]{"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
    public static final String[] HEX = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        String result = "";
        if (binaryNumber == null) {
            return result;
        }
        if (binaryNumber.length() % 4 != 0) {
            for (int i = 0; i < binaryNumber.length() % 4; i++) {
                binaryNumber = "0" + binaryNumber;
            }
        }
        for (int i = 0; i < binaryNumber.length(); i += 4) {
            String toHexVal = binaryNumber.substring(i, i + 4);
            if (Arrays.binarySearch(BIN, toHexVal) < 0) {
                return "";
            }
            for (int j = 0; j < BIN.length; j++) {
                if (BIN[j].equals(toHexVal)) {
                    result = result + HEX[j];
                }
            }
        }
        return result;
    }
    public static String toBinary(String hexNumber) {
        String result = "";
        if (hexNumber == null) {
            return result;
        }
        for (int i = 0; i < hexNumber.length(); i++) {
            String toBinVal = hexNumber.substring(i, i + 1);
            if (Arrays.binarySearch(HEX, toBinVal) < 0) {
                return "";
            }
            for (int j = 0; j < HEX.length; j++) {
                if (HEX[j].equals(toBinVal)) {
                    result = result + BIN[j];
                }
            }
        }
        return result;
    }
}









           /* if (toHexVal.equals("0000")) {
                result = result + "0";
            } else if (toHexVal.equals("0001")) {
                result = result + "1";
            } else if (toHexVal.equals("0010")) {
                result = result + "2";
            } else if (toHexVal.equals("0011")) {
                result = result + "3";
            } else if (toHexVal.equals("0100")) {
                result = result + "4";
            } else if (toHexVal.equals("0101")) {
                result = result + "5";
            } else if (toHexVal.equals("0110")) {
                result = result + "6";
            } else if (toHexVal.equals("0111")) {
                result = result + "7";
            } else if (toHexVal.equals("1000")) {
                result = result + "8";
            } else if (toHexVal.equals("1001")) {
                result = result + "9";
            } else if (toHexVal.equals("1010")) {
                result = result + "a";
            } else if (toHexVal.equals("1011")) {
                result = result + "b";
            } else if (toHexVal.equals("1100")) {
                result = result + "c";
            } else if (toHexVal.equals("1101")) {
                result = result + "d";
            } else if (toHexVal.equals("1110")) {
                result = result + "e";
            } else if (toHexVal.equals("1111")) {
                result = result + "f";
            } else return "";
        }
        return result;*/
//            }/*
//        }*/

    /*public static String toBinary(String hexNumber) {

        String result = "";
        if (hexNumber == null) {
            return result;//напишите тут ваш код
        }
        for (int i = 0; i < hexNumber.length(); i++) {
            String toBinVal = hexNumber.substring(i, i + 1);
            if (toBinVal.equals("0")) {
                result = result + "0000";
            } else if (toBinVal.equals("1")) {
                result = result + "0001";
            } else if (toBinVal.equals("2")) {
                result = result + "0010";
            } else if (toBinVal.equals("3")) {
                result = result + "0011";
            } else if (toBinVal.equals("4")) {
                result = result + "0100";
            } else if (toBinVal.equals("5")) {
                result = result + "0101";
            } else if (toBinVal.equals("6")) {
                result = result + "0110";
            } else if (toBinVal.equals("7")) {
                result = result + "0111";
            } else if (toBinVal.equals("8")) {
                result = result + "1000";
            } else if (toBinVal.equals("9")) {
                result = result + "1001";
            } else if (toBinVal.equals("a")) {
                result = result + "1010";
            } else if (toBinVal.equals("b")) {
                result = result + "1011";
            } else if (toBinVal.equals("c")) {
                result = result + "1100";
            } else if (toBinVal.equals("d")) {
                result = result + "1101";
            } else if (toBinVal.equals("e")) {
                result = result + "1110";
            } else if (toBinVal.equals("f")) {
                result = result + "1111";
            } else return "";
        }
        return result;
    }
}*/

