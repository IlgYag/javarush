package com.javarush.task.pro.task15.task1506;

import java.io.CharArrayReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
//            List<String> input = List.of("sdf", "", "dk", " ", ".", "djslahfl sdfkl kfls, dklsfjl,.");
            List<String> input = Files.readAllLines(Paths.get(scanner.nextLine()));

            for (String string : input) {
//                char character = (char) input.read();
//                if (character != '.' && character != ' ' && character != ',') {
                    System.out.println(string.replaceAll("[., ]",""));
//                }
            }
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

