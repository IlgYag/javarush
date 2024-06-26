package com.javarush.task.pro.task18.task1823;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* 
Из потока данных во множество
*/

public class Solution {

    public static void main(String[] args) {
        var stringStream = Stream.of("JavaRush", "CodeGym", "Amigo", "Elly", "Kim", "Risha");

        getFilteredStrings(stringStream).forEach(System.out::println);
    }

    public static Set<String> getFilteredStrings(Stream<String> stringStream) {
        return stringStream.filter(x -> x.length() > 6).collect(Collectors.toSet());
    }
}
