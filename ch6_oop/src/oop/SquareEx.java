package oop;

public class SquareEx {
    public static void main(String[] args) {
        Square[] squareArr = new Square[5];
        squareArr[0] = new Square(10);
        squareArr[1] = new Square(5);
        squareArr[2] = new Square(13);
        squareArr[3] = new Square(7);
        squareArr[4] = new Square(3);
        for (Square square2 : squareArr) {
            System.out.println(square2.getArea());
        }
    }
}
