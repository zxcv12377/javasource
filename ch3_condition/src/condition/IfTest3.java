package condition;

import java.util.Scanner;

public class IfTest3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("점수 입력");
        String str = scanner.nextLine();
        int score = Integer.parseInt(str);


        if (score >= 90) {
            System.out.println("점수 90 이상");
            System.out.println("A");
        } else {
            System.out.println("점수 90 미만");
            System.out.println("B");
        }
        scanner.close();
    }
}
