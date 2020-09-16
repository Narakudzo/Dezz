package ru.mirea.ikbo0819.pr3.N1Shape;

abstract class Shape
{
    protected String color;
    protected boolean filled;

    public Shape() {
        this.filled = false;
        this.color = "blue";
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String toString() {
        return "Shape{Color='" + this.color + "', Filled=" + this.filled + "}";
    }
}

class Circle extends Shape
{
    protected double radius;

    public Circle() {
        this.filled = false;
        this.color = "blue";
        this.radius = 1.0D;
    }

    public Circle(double radius) {
        this.filled = false;
        this.color = "blue";
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        this.filled = filled;
        this.color = color;
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.141592653589793D * this.radius * this.radius;
    }

    public double getPerimeter() {
        return 6.283185307179586D * this.radius;
    }

    public String toString() {
        return super.toString();
    }
}

class Rectangle extends Shape
{
    protected double width;
    protected double length;

    public Rectangle() {
        this.filled = false;
        this.color = "blue";
        this.length = 5.0D;
        this.width = 4.0D;
    }

    public Rectangle(double width, double length) {
        this.filled = false;
        this.color = "blue";
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        this.filled = filled;
        this.color = color;
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return 2.0D * (this.width + this.length);
    }

    public String toString() {
        return super.toString();
    }
}

class Square extends Rectangle {
    protected double side;

    public Square() {
        this.filled = false;
        this.color = "blue";
        this.side = 4.0D;
    }

    public Square(double side) {
        this.filled = false;
        this.color = "blue";
        this.side = side;
    }

    public Square(double side, boolean filled, String color) {
        this.filled = filled;
        this.color = color;
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side) {
        super.setWidth(side);
    }

    public void setLength(double side) {
        super.setLength(side);
    }

    public String toString() {
        return super.toString();
    }
}

