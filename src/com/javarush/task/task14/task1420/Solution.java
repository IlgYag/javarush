package com.javarush.task.task14.task1420;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, result;
        num1 = getInt(scanner);
        num2 = getInt(scanner);
        System.out.println(findNod(Math.min(num1, num2), Math.max(num1, num2)));
    }

    public static int getInt(Scanner scanner) {
        int result = 0;
        if (scanner.hasNextInt()) {
            result = scanner.nextInt();
        }
        return result;
    }

    public static List<Integer> getDeviders(int number) {
        List<Integer> result = new ArrayList<>();
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    result.add(i);
                }
            }
        return result;
    }
    public static Integer findNod(int num1, int num2) {
        if (num1 < 1 || num2 < 1) {
            throw new IllegalArgumentException();
        }
        List<Integer> num1Deviders, num2Deviders;
        num1Deviders = getDeviders(num1);
        num2Deviders = getDeviders(num2);
        int maxDivid = 1;
        for (int i = num1Deviders.size() - 1; i >= 0; i--) {
            if (num2Deviders.contains(num1Deviders.get(i))) {
                maxDivid = num1Deviders.get(i);
                break;
            }
        }
        return maxDivid;
    }
}
