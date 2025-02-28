package loop;

public class ForEx18 {
    public static void main(String[] args) {
        int count;
        for (int i = 2; i < 101; i++) {
            count = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
                if (count > 2) {
                    break;
                }
            }
            if (!(count > 2)) {
                System.out.printf("%3d", i);
            }
        }
    }
}