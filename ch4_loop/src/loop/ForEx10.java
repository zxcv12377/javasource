package loop;

import java.util.Scanner;

public class ForEx10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int line = Integer.parseInt(input);

        for (int i = 1; i <= line; i++) {
            for (int j = line - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
