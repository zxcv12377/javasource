package loop;

public class BreakEx2 {
    public static void main(String[] args) {

        while (true) {
            int dice = (int) (Math.random() * 6) + 1;
            System.out.printf("주사위 값%d\n", dice);
            if (dice == 6)
                break;
        }
    }
}
