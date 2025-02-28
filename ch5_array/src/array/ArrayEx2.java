package array;

import java.util.Arrays;

public class ArrayEx2 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 10 + 10;
        }

        System.out.println(Arrays.toString(arr));

        for (int i : arr) {
            System.out.print(i + "  ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
