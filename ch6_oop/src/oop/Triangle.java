package oop;

public class Triangle {
    int baseLine;
    int height;

    public Triangle() {

    }

    public Triangle(int baseLine, int height) {
        this.baseLine = baseLine;
        this.height = height;
    }

    double getArea() {
        return (baseLine * height) / 2.0;
    }

    @Override
    public String toString() {
        return "Triangle [baseLine=" + baseLine + ", height=" + height + "]";
    }
}
