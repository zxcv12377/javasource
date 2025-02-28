package op;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("두자리 정수 입력 : ");
        String i = sc.nextLine();
        int num = Integer.parseInt(i);
        System.out.println("입력값 : " + num);

        sc.close();

    }
}
