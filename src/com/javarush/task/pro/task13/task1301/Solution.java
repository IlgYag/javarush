package com.javarush.task.pro.task13.task1301;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/* 
Оформляем возврат
*/

public class Solution {
    public static void main(String[] args) {
        String[] array = {"Через", "три", "года", "я", "буду", "Senior", "Java", "Developer"};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("___________________________________");

        HashSet<String> hashSet = arrayToHashSet(array);
        for(String s : hashSet) {
        System.out.println(s);
    }
//        for (int i = 0; i < hashSet.size(); i++) {
//            System.out.println(hashSet.get);
//        }

    }

    public static HashSet<String> arrayToHashSet(String[] strings) {
        HashSet<String> newHashSet = new HashSet<>();
        for (int i = 0; i < strings.length; i++){
           newHashSet.add(strings[i]);
        }
        return newHashSet;
    }
}
