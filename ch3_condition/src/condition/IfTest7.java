package condition;

import java.util.Scanner;

public class IfTest7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("정수 입력 : ");
        String input = scanner.nextLine();

        if (isNumberic(input)) {
            int num1 = Integer.parseInt(input);

            if (num1 % 2 == 0) {
                System.out.println("짝수");
            } else {
                System.out.println("홀수");
            }
        } else {
            
        }
        scanner.close();

    }

    public static boolean isNumberic(String str) {
        try {
            Double.parseDouble(str);
        } catch (NumberFormatException e) {
            System.err.println("정수나 입력해");
            return false;
        }
        return true;
    }
}
