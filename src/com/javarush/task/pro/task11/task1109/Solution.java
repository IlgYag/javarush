package com.javarush.task.pro.task11.task1109;

/* 
Объекты внутренних и вложенных классов
*/

public class Solution {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner =  outer.new Inner();
//        inner = new Outer.Inner();
        new Outer.Nested();//напишите тут ваш код
    }
}
