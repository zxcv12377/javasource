package condition;

import java.util.Scanner;

public class IfTest4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("점수 입력 : ");
        String str = scanner.nextLine();
        int score = Integer.parseInt(str);

        if (score >= 90) {
            System.out.println("등급은 A 입니다.");
        } else if (score >= 80) {
            System.out.println("등급은 B 입니다.");
        } else if (score >= 70) {
            System.out.println("등급은 C 입니다.");
        } else if (score >= 60) {
            System.out.println("등급은 D 입니다.");
        } else {
            System.out.println("등급은 F 입니다.");
        }
        scanner.close();
    }
}
