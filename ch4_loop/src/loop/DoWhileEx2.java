package loop;

import java.util.Scanner;

public class DoWhileEx2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = "";
        do {
            System.out.println("종료를 원하면 q 또는 Q를 입력");
            System.out.print("문자 입력 : ");
            str = scanner.nextLine();
            System.out.println(str);
        } while (!str.equalsIgnoreCase("q"));
        System.out.println("프로그램 종료");
        scanner.close();
    }
}
