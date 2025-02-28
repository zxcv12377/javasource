package loop;

public class ContinueEx1 {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }

        for (int i = 1; i < 11; i++) {
            if (i % 2 != 0)
                continue;
            System.out.println(i);
        }
    }
}
