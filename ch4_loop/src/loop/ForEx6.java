package loop;

import java.util.Scanner;

public class ForEx6 {
    public static void main(String[] args) {// 팩토리얼 구하는 문제
        
        int sum = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.printf("정수 입력 : ");
        String str = scanner.nextLine();
        int num = Integer.parseInt(str);

        for(int i = num; i > 0; i--){
            sum *= i;
        }

        System.out.printf("!%d의 값은%d",num ,sum);
        scanner.close();
    }
}
