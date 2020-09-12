package ru.mirea.ikbo0819.pr2.book;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(512, 28);
        System.out.println(b1);
        b1.move(74, 37);
        System.out.println(b1);
    }
}