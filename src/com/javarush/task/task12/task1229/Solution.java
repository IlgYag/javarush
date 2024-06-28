package com.javarush.task.task12.task1229;

/* 
Родитель класса CTO
*/

public class Solution {

    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static interface Businessman {
        public default void workHard(){}
    }
    public static class Worker implements Businessman{
        @Override
        public void workHard() {
            Businessman.super.workHard();
        }
    }

    public static class CTO extends Worker implements Businessman{

    }
}
