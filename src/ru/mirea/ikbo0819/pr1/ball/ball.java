package ru.mirea.ikbo0819.pr1.ball;

import java.lang.*;
public class ball {
    private String color;
    private String weight;
    private int radius;
    public ball(String n, int a,String b){
        color = n;
        radius = a;
        weight = b;
    }
    public ball(String n){
        color = n;
        radius = 0;
        weight = "0,11gr";


    }
    public ball(){
        color = "Pup";
        radius = 0;
        weight = "0,11gr";
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setWeight(String color) {
        this.color = color;
    }
    public String getColor(String color){
        return color;
    }
    public int getRadius() {
        return radius;
    }
    public String getWeight(String weight){
        return weight;
    }
    public String toString(){
        return this.color+", age "+this.radius;
    }
    public void intoHumanAge(){
        System.out.println("A " + color  + " ball with a radius of " + radius + " weighs "+ weight);
    }
}