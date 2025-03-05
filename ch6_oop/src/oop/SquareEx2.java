package oop;

import java.util.Arrays;

public class SquareEx2 {
    public static void main(String[] args) {
        Square[] squareArr = new Square[5];
        System.out.println(Arrays.toString(squareArr));

        // squareArr[0] = new Square();
        // squareArr[1] = new Square();
        // squareArr[2] = new Square();
        // squareArr[3] = new Square();
        // squareArr[4] = new Square();

        for (int i = 0; i < squareArr.length; i++) {
            squareArr[i] = new Square();
        }

        squareArr[0].sideLength = 35;
        squareArr[1].sideLength = 13;
        squareArr[2].sideLength = 15;
        squareArr[3].sideLength = 672;
        squareArr[4].sideLength = 266;

        for (int i = 0; i < squareArr.length; i++) {
            System.out.printf("%d 번쨰 면적 : %d \n", (i + 1), squareArr[i].getArea());
        }
    }
}
