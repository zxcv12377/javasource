package array;

import java.util.Arrays;

public class ArrayEx10 {
    public static void main(String[] args) {
        int[] ball = new int[45];
        for (int i = 0; i < ball.length; i++) {
            ball[i] = i + 1;
        }

        System.out.println(Arrays.toString(ball));
        int temp;
        // int count = 0;
        for (int i = 0; i < 6; i++) {
            // if (count > 5) {
            // count = 0;
            // }
            int pos = (int) (Math.random() * 45);
            temp = ball[i];
            ball[i] = ball[pos];
            ball[pos] = temp;
            // count++;
        }
        System.out.println(Arrays.toString(ball));
    }
}
