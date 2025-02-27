package condition;

import java.util.Scanner;

public class IfTest9 {
    public static void main(String[] args) {
        //윤년 평년 구하기
         Scanner scanner = new Scanner(System.in);
         System.out.printf("년도 입력 : ");
         String input = scanner.nextLine();
         int year = Integer.parseInt(input);

         if((year % 4 == 0 && year % 100 == 0) || year % 400 == 0){
            System.out.println("윤년");
         }else{
            System.out.println("평년");
         }
         scanner.close();
    }
}
