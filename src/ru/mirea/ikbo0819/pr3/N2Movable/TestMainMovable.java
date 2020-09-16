package ru.mirea.ikbo0819.pr3.N2Movable;

public class TestMainMovable {
    public TestMainMovable(){}

    public static void main(String[] args) {
        MoviblePointRectangle c1 = new MoviblePointRectangle(-6, -1, -3, 5, 3, 3);
        System.out.println(c1);
        c1.moveUp();
        System.out.println(c1);
    }

}
