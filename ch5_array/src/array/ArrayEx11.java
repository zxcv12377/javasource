package array;

import java.util.Arrays;

public class ArrayEx11 {
    public static void main(String[] args) {
        int[] score = { 75, 88, 91, 33, 100, 55, 95 };
        System.out.println(Arrays.toString(score));
        for (int i = 0; i < score.length - 1; i++) {
            for (int j = 0; j < score.length - 1 - i; j++) {
                if (score[j] > score[j + 1]) {
                    int temp = score[j];
                    score[j] = score[j + 1];
                    score[j + 1] = temp;
                }
            }
        }
        // Arrays.sort(score);
        System.out.println(Arrays.toString(score));

    }
}
