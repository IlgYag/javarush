package com.javarush.task.task11.task1123;

public class Solution {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair result = getMinimumMaximumPair(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair getMinimumMaximumPair(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return new Pair(null, null);
        }
        int maxVal = inputArray[0];
        int minVal = inputArray[0];
        for (int i = 0; i < inputArray.length - 1; i++) {
            if (maxVal < inputArray[i + 1]) {
                maxVal = inputArray[i + 1];
            }
            if (minVal > inputArray[i + 1]) {
                minVal = inputArray[i + 1];
            }
        }
        return new Pair(minVal, maxVal);
}
public static class Pair {
    public Integer x;
    public Integer y;

    public Pair(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }
}
}
