package oop;

public class Square {
    int sideLength;

    public Square() {

    }

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    int getArea() {
        return sideLength * sideLength;
    }
}
