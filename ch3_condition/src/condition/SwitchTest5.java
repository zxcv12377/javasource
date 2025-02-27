package condition;

import java.util.Scanner;

public class SwitchTest5 {
    public static void main(String[] args) {
        // 점수 0~100 점수에 따른 등급 출력
        // 90A 80B 70C F
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);
        int score = num / 10;

        switch (score) {
            case 9: case 10:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;

            default:
                System.out.println("F");
                break;
        }
        scanner.close();
    }
}
