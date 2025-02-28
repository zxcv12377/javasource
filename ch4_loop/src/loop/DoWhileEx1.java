package loop;

import java.util.Scanner;

public class DoWhileEx1 {
    public static void main(String[] args) {

        int rand = (int) (Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        do {
            System.out.print("정수 입력 : ");
            String str = scanner.nextLine();
            num = Integer.parseInt(str);
            if (num > rand) {
                System.out.println("숫자가 큽니다");
            } else if (num < rand) {
                System.out.println("숫자가 작습니다");
            }
        } while (num != rand);
        System.out.println("정답 컴퓨터 : " + rand);
        scanner.close();
    }
}
