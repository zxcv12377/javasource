package loop;

import java.util.Scanner;

public class BreakEx3 {
    public static void main(String[] args) {

        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        String input;
        int menu;
        int in;
        int money = 0;
        int out;

        while (run) {

            System.out.println("======================================");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4.종료");
            System.out.println("======================================");

            System.out.print("\n메뉴 번호 입력>>");
            input = scanner.nextLine();
            menu = Integer.parseInt(input);
            switch (menu) {
                case 1:
                    System.out.println("예금액을 입력하시오.");
                    input = scanner.nextLine();
                    in = Integer.parseInt(input);
                    money += in;
                    System.out.printf("현재 잔액은 %d\n", money);
                    break;
                case 2:
                    System.out.println("출금액을 입력하시오.");
                    input = scanner.nextLine();
                    out = Integer.parseInt(input);
                    money -= out;
                    System.out.printf("현재 잔액은 %d\n", money);
                    break;
                case 3:
                    System.out.printf("현재 잔액은 %d 입니다.\n", money);
                    break;
                case 4:
                    run = false;
                    break;
                default:
                    break;
            }
        }
        scanner.close();
    }
}
