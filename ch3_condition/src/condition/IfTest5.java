package condition;

public class IfTest5 {
    public static void main(String[] args) {
        int num = (int)(Math.random() * 6 + 1);
        //System.out.printf("주사위 %d번이 나왔습니다.", num);
        if (num == 1) {
            System.out.println("주사위 1번 나옴");
        } else if(num == 2){
            System.out.println("주사위 2번 나옴");
        } else if(num == 3){
            System.out.println("주사위 3번 나옴");
        } else if(num == 4){
            System.out.println("주사위 4번 나옴");
        } else if(num == 5){
            System.out.println("주사위 5번 나옴");
        }else {
            System.out.println("주사위 6번 나옴");
        }
    }
}
