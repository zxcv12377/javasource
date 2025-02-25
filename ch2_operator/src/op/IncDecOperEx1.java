package op;

public class IncDecOperEx1 {
    public static void main(String[] args) {
        int num = 10;

        //num = num + 1;
        num++;
        System.out.println("num = "+num);
        
        // num = num - 1;
        num--;
        System.out.println("num = "+num);
        
        int num2 = 20;
        System.out.println("num2 = "+(num2++)); // 먼저 값을 출력한 후 증가함
        // 후위 연산자
        num2 = 20;
        System.out.println("num2 = "+(++num2)); // 먼저 증가하고 값을 출력
        // 전위 연산자
    }
}
