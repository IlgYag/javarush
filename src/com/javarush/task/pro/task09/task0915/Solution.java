package com.javarush.task.pro.task09.task0915;

import java.util.Arrays;
import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer strEl = new StringTokenizer(query, delimiter);//напишите тут ваш код
        String[] result = new String[strEl.countTokens()];
        for (int i = 0; i < result.length; i++) {
            result[i] = strEl.nextToken();
        }
        return result;
    }
}
