package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        InputStream inStream = new FileInputStream(path);
        Reader reader = new InputStreamReader(inStream);
        BufferedReader bufferedReader = new BufferedReader(reader);
//        Writer writer = new Writer();
//        BufferedWriter bufferedWriter = new BufferedWriter();
        String str = bufferedReader.readLine();
        while (str != null) {
            System.out.println(str);
            str = bufferedReader.readLine();
        }
        inStream.close();
        reader.close();
        bufferedReader.close();
    }
}