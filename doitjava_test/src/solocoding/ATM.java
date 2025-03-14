package solocoding;

import java.util.Arrays;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        String input = sc.nextLine();
        String[] inputArr = input.split(" ");
        for (int i = 0; i < inputArr.length; i++) {
            arr[i] = Integer.parseInt(inputArr[i]);
        }
        System.out.println(atmTime(arr));
        sc.close();
    }

    public static int atmTime(int[] a) {
        int result = 0;
        Arrays.sort(a);
        for (int i = 1; i < a.length + 1; i++) {
            result += f(a, i);
            System.out.println(result);
        }
        return result;
    }

    public static int f(int[] a, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }

        return sum;
    }

}
