package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        int[] arr;

        Scanner sc = new Scanner(System.in);
        System.out.printf("학생 수를 입력 >> ");
        int students = sc.nextInt();
        arr = new int[students];

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d번 학생 점수 입력 >> ", i + 1);
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double average = (double) sum / arr.length;
        System.out.printf("총합 : %d, 평균 : %.2f", sum, average);
        sc.close();
    }
}
