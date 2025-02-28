package op;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("두자리 정수 입력 : ");
        int input = sc.nextInt();
        System.out.println(input);

        sc.close();
    }
}
