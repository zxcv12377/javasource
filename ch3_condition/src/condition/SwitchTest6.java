package condition;

import java.util.Scanner;

public class SwitchTest6 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력1");
        String input1 = scanner.nextLine();
        int num1 = Integer.parseInt(input1);

        System.out.println("입력2");
        String input2 = scanner.nextLine();
        int num2 = Integer.parseInt(input2);

        System.out.println("연산자");
        String input3 = scanner.nextLine();

        switch (input3) {
            case "+":
                System.out.printf("\n%d + %d = %d", num1, num2, num1 + num2);
                break;
            case "-":
                System.out.printf("\n%d - %d = %d", num1, num2, num1 - num2);
                break;
            case "*":
                System.out.printf("\n%d * %d = %d", num1, num2, num1 * num2);
                break;
            case "/":
                System.out.printf("\n%d / %d = %d", num1, num2, num1 / num2);
                break;
            case "%":
                System.out.printf("\n%d %% %d = %d", num1, num2, num1 % num2);
                break;

            default:
                break;
        }
        scanner.close();
    }
}
