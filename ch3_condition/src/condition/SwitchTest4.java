package condition;

import java.util.Scanner;

public class SwitchTest4 {

    public static void main(String[] args) {
        // 가위.1바위.2보.3


        int com = (int) (Math.random() * 3) + 1;

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int user = Integer.parseInt(input);
        if(user > 3){
            System.out.println("ㄴㄴ");
            scanner.close();
            return;
        }
        int num = com - user;

        switch (num) {
            case 0:
                System.out.println("비김");
                break;
            case 1:
                System.out.println("짐");
                break;
            case 2:
                System.out.println("이김");
                break;
            case -1:
                System.out.println("이김");
                break;
            case -2:
                System.out.println("짐");
                break;
            default:
                break;
        }
        scanner.close();

    }
}
