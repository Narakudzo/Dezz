package ru.mirea.ikbo0819.pr1.ball;


import java.lang.*;
public class Tesball {
    public static void main(String[] args) {
        ball b1 = new ball("Red", 2,"0,25gr");
        ball b2 = new ball("Green", 7,"0,125gr");
        ball b3 = new ball("Bob");
        b3.setRadius(1);
        System.out.println(b1);
        b1.intoHumanAge();
        b2.intoHumanAge();
        b3.intoHumanAge();
    }
}