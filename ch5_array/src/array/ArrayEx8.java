package array;

public class ArrayEx8 {
    public static void main(String[] args) {
        int[] score = { 75, 88, 91, 33, 100, 55, 95 };
        int min = score[0];
        int max = score[0];
        // Arrays.sort(score);
        for (int i = 1; i < score.length; i++) {
            if (max < score[i]) {
                max = score[i];
            } else if (min > score[i]) {
                min = score[i];
            }
        }
        System.out.printf("%d / %d", min, max);

    }
}
