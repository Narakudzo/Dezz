package ru.mirea.ikbo0819.pr3.N2Movable;

public interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}
class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public String toString() {
        return "MovablePoint{x=" + this.x + ", y=" + this.y + ", xSpeed=" + this.xSpeed + ", ySpeed=" + this.ySpeed + "}";
    }
    public void moveUp() {
        ++this.y;
    }
    public void moveDown() {
        --this.y;
    }
    public void moveRight() {
        ++this.x;
    }
    public void moveLeft() {
        --this.x;
    }
}
class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }
    public String toString() {
        return "MovableCircle{radius=" + this.radius + ", center=" + this.center + "}";
    }
    public void moveUp() {
        ++this.center.y;
    }
    public void moveDown() {
        --this.center.y;
    }
    public void moveRight() {
        ++this.center.x;
    }
    public void moveLeft() {
        --this.center.x;
    }
}

class MoviblePointRectangle implements Movable {
    int x1;
    int y1;
    int x2;
    int y2;
    int xSpeed;
    int ySpeed;
    public MoviblePointRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public void setX1(int x1) {
        this.x1 = x1;
    }
    public void setY1(int y1) {
        this.y1 = y1;
    }
    public void setX2(int x2) {
        this.x2 = x2;
    }
    public void setY2(int y2) {
        this.y2 = y2;
    }
    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }
    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }
    public String toString() {
        return "MoviblePointRectangle{x1=" + this.x1 + ", y1=" + this.y1 + ", x2=" + this.x2 + ", y2=" + this.y2 + ", xSpeed=" + this.xSpeed + ", ySpeed=" + this.ySpeed + "}";
    }
    public void moveUp() {
        if (this.Proverka()) {
            ++this.y1;
            ++this.y2;
        }

    }
    public void moveDown() {
        if (this.Proverka()) {
            --this.y1;
            --this.y2;
        }

    }
    public void moveRight() {
        if (this.Proverka()) {
            ++this.x1;
            ++this.x2;
        }

    }
    public void moveLeft() {
        if (this.Proverka()) {
            --this.x1;
            --this.x2;
        }

    }
    public boolean Proverka() {
        return this.xSpeed == this.ySpeed;
    }
}

class MovableRectangle implements Movable {
    private MoviblePointRectangle topLeft;
    private MoviblePointRectangle bottomRight;
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MoviblePointRectangle(x1, y1, x2, y2, xSpeed, ySpeed);
        this.bottomRight = new MoviblePointRectangle(x1, y1, x2, y2, xSpeed, ySpeed);
    }
    public String toString() {
        return "MovableRectangle{topLeft=" + this.topLeft + ", bottomRight=" + this.bottomRight + "}";
    }
    public void moveUp() {
        if (this.Proverka()) {
            ++this.topLeft.y1;
            ++this.topLeft.y2;
        }

    }
    public void moveDown() {
        if (this.Proverka()) {
            --this.topLeft.y1;
            --this.topLeft.y2;
        }

    }
    public void moveRight() {
        if (this.Proverka()) {
            ++this.topLeft.x1;
            ++this.topLeft.x2;
        }

    }
    public void moveLeft() {
        if (this.Proverka()) {
            --this.topLeft.x1;
            --this.topLeft.x2;
        }
    }
    public boolean Proverka() {
        return this.topLeft.xSpeed == this.bottomRight.xSpeed && this.topLeft.ySpeed == this.bottomRight.ySpeed;
    }
}
