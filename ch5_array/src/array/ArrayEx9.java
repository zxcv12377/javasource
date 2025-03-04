package array;

import java.util.Arrays;

public class ArrayEx9 {
    public static void main(String[] args) {
        int[] numArr = new int[10];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = i;
        }

        System.out.println(Arrays.toString(numArr));
        int temp;
        for (int i = 0; i < 100; i++) {
            int pos = (int) (Math.random() * 10);
            temp = numArr[0];
            numArr[0] = numArr[pos];
            numArr[pos] = temp;
        }
        System.out.println(Arrays.toString(numArr));
    }
}
