package com.javarush.task.pro.task10.task1010;

import java.util.Objects;

/* 
Два айфона
*/

public class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (!(object instanceof Iphone)) {
            return false;
        }
        Iphone iphone = (Iphone) object;

        if (this.price != iphone.price) {
            return false;
        }
        if (this.model == null && iphone.model != null) {
            return false;
        }
        if (this.model != null && !this.model.equals(iphone.model)) {
            return false;
        }

        if (this.color == null && iphone.color != null) {
            return false;
        }
        if (this.color != null && !this.color.equals(iphone.color)) {
            return false;
        }
        return true;
    }


    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);

        System.out.println(iphone1.equals(iphone2));
    }

}
