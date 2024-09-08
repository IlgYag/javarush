package com.javarush.task.task13.task1326;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws Exception{
//        Reader inputStream = new InputStreamReader (System.in);
//        BufferedReader bufferedReader = new BufferedReader(inputStream);
//        String destin = bufferedReader.readLine();
//        FileInputStream fileInputStream = new FileInputStream("C:\\Jawa Exercises\\textLine.txt");
//        fileInputStream.read();
//        Scanner scanner = new Scanner(System.in);
//        String fileName = scanner.nextLine();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFileName = reader.readLine();
        Scanner scanner = new Scanner(new FileInputStream(sourceFileName));
//        Scanner scanner = new Scanner("C:\\Jawa Exercises\\textLine.txt");
        List<Integer> intList = new ArrayList<>();

        while (scanner.hasNextInt()) {
           int num = scanner.nextInt();
           if (num%2 == 0){
               intList.add(num);
           }
        }
        Collections.sort(intList);
        for (int value : intList){
            System.out.println(value);
        }

scanner.close();
    }
}
