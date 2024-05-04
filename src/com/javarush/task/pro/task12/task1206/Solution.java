package com.javarush.task.pro.task12.task1206;

/* 
Анализ строк
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        char[] chars = string.toCharArray();
        int digCount = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(chars[i])) {
                digCount++;
            }
            ;
        }
        return digCount;//напишите тут ваш код
    }

    public static int countLetters(String string) {
        int letCount = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))) {
                letCount++;//напишите тут ваш код
            }
        }
        return letCount;
    }

    public static int countSpaces(String string) {
        int spacesCount = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isSpaceChar(string.charAt(i))) {
                spacesCount++;//напишите тут ваш код
            }
        }
        return spacesCount;  //напишите тут ваш код
    }
}
