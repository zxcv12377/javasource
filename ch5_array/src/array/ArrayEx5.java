package array;

import java.util.Arrays;

public class ArrayEx5 {
    public static void main(String[] args) {
        char[] chArr = new char[5];
        for (int i = 0; i < chArr.length; i++) {
            chArr[i] = (char) ('A' + i);
        }
        System.out.println(chArr);
        chArr[2] = 'F';
        System.out.println(Arrays.toString(chArr));

        double[] doubleArr = { 90.5, 88.12, 78.45, 62.4, 55 };
        System.out.println(doubleArr);
        System.out.println(Arrays.toString(doubleArr));
    }
}
