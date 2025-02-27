package condition;

public class SwitchTest3 {
    public static void main(String[] args) {
        String position = "과장";

        switch (position) {
            case "부장":
                System.out.println("700마넌");
                break;
            case "과장":
                System.out.println("500마넌");
                break;
            default:
                System.out.println("300마넌");
                break;
        }
    }
}
