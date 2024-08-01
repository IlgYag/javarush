package com.javarush.task.task13.task1319;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        try (OutputStream fOutS = new FileOutputStream(path);
             Writer wr = new OutputStreamWriter(fOutS);
             BufferedWriter bufWriter = new BufferedWriter(wr)) {
            String textLine = "";
            do {
                textLine = scanner.nextLine();
                bufWriter.write(textLine);
                bufWriter.newLine();
            }
            while (!textLine.equalsIgnoreCase("exit"));
        }
    }
}

