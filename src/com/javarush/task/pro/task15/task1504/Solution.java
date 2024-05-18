package com.javarush.task.pro.task15.task1504;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             InputStream inputStream = Files.newInputStream(Paths.get(scanner.nextLine()));
             OutputStream outputStream = Files.newOutputStream(Paths.get(scanner.nextLine()))
//             InputStream inputStream = new ByteArrayInputStream(new byte[]{1,3,5,6,8});
//             ByteArrayOutputStream outputStream = new ByteArrayOutputStream()
        ) {
            byte[] buffer = new byte[2];
            while (inputStream.available() > 0) {
                int inpByte1 = inputStream.read(buffer);
                if (inpByte1 % 2 == 0) {
                    byte tmp = buffer[0];
                    buffer[0] = buffer[1];
                    buffer[1] = tmp;
                    outputStream.write(buffer);
                } else {
                    outputStream.write(buffer[0]);
                }
            }
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

