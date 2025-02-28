package loop;

public class ForEx16 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if (i > 5) {
                for (int j = 0; j < (i - 5); j++) {
                    System.out.print(" ");
                }
                for (int j = i - 5; j < (5 * 2) - (i - 5) - 1; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 5 - i; j > 0; j--) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i * 2 - 1; j++) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}
