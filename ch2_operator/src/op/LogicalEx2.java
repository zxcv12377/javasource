package op;

import java.util.Scanner;

public class LogicalEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("문자를 하나 입력 하시오 : ");
        String input = scanner.nextLine();
        
        char ch = input.charAt(0);
        if('0' <= ch && ch <= '9'){
            System.out.println("숫자임");
        }
        if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')){
            System.out.println("영어임");
        }
        scanner.close();
    }
}
