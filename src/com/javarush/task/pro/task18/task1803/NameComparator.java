package com.javarush.task.pro.task18.task1803;

/*
Наставники JavaRush
*/

import java.util.Comparator;

public class NameComparator implements Comparator<JavaRushMentor> {
    public int compare (JavaRushMentor mentor1, JavaRushMentor mentor2){
        return mentor1.getName().length()-mentor2.getName().length();
    }
}
