package condition;

import java.util.Scanner;

public class IfTest8 {
    public static void main(String[] args) {
        //시간당 임금 일급
        // 8시간 까지는 시간당 임금
        // 초과 근무시간 때는 시간당 임금 * 1.5
        int rate = 9800;
        int pay, hours;

        Scanner scanner = new Scanner(System.in);
        System.out.printf("하루 근무 시간 : ");
        String input = scanner.nextLine();
        if(inNumberic(input)){
            hours = Integer.parseInt(input);

            if(hours > 8){
                pay = (int)((8 * rate) + (hours - 8) * (rate * 1.5f));
            }
            else{
                pay = hours * rate;
            }
    
            System.out.println("받는 임금은 " + pay + "원 입니다.");
            scanner.close();
        }
    }

    public static boolean inNumberic(String str){
        try {
            Double.parseDouble(str);
        } catch (NumberFormatException e) {
            System.err.println("정수 입력 하쇼");
            return false;
        }
        return true;
    }
}
