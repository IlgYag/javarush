package com.javarush.task.pro.task03.task0301;

import java.util.Scanner;

/* 
Тепло или холодно
*/

public class Solution {
    public static void main(String[] args) {
        String cold = "на улице холодно";
        String warm = "на улице тепло";
        Scanner entertemp = new Scanner(System.in);
        if (entertemp.hasNextInt()){
            if (entertemp.nextInt()<0){
                System.out.println(cold);}
        else{
            System.out.println(warm);}}
        else{
            System.out.println("Необходимо ввести цифру");}
    //напишите тут ваш код
    }
}
