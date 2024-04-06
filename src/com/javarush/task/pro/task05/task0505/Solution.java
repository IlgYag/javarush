package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // int ln = scanner.nextInt();
       // if (n > 0) {
            int lengthArr = scanner.nextInt();
            int[] mainArray = new int[lengthArr];
            for (int i = 0; i < mainArray.length; i++) {
                mainArray[i] = scanner.nextInt();
                //напишите тут ваш код

            }
            if (lengthArr % 2 == 0) {
                for (int i = mainArray.length-1; i >= 0 ;i--){
                    System.out.println(mainArray[i]);
                }
            }
            else  {
                for (int i = 0; i < lengthArr;i++) {
                    System.out.println(mainArray[i]);
                }
            }
        //}
    }
}
