package loop;

import java.util.Scanner;

public class ForEx13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int line = Integer.parseInt(input);

        for (int i = 1; i <= line; i++) {
            for (int j = line - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}// 97531 j=0 line = 5*2-1 <-9
 // line = 5*2-3 <-7
