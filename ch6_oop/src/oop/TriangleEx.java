package oop;

public class TriangleEx {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.baseLine = 7;
        triangle.height = 7;

        System.out.printf("면적은 : %.2f", triangle.getArea());

        triangle = new Triangle(20, 10);
        System.out.printf("면적은 : %.2f", triangle.getArea());
    }
}
