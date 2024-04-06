package com.javarush.task.pro.task05.task0504;

/* 
Объединяем массивы
*/

public class Solution {
    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray;

    public static void main(String[] args) {
        int l1 = firstArray.length;
        int l2 = secondArray.length;
        int l = l1 + l2;
        resultArray = new int[l];
        for (int i = 0; i < l1; i++);{
            resultArray[i] = firstArray[i];
        }
        for (int i = 0; i < l2; i++);{
            resultArray[l1+i] = secondArray[i];
        }
        //напишите тут ваш код
            for (int i = 0; i < resultArray.length; i++) {
                System.out.print(resultArray[i] + ", ");
            }
    }
}
