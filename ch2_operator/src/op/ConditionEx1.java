package op;

// 삼항연산자 
// 조건 ? true : false

public class ConditionEx1 {
    public static void main(String[] args) {
        int x, y, z;

        x = 10;
        y = 5;
        z = 0;
        int result1 = x < 0 ? -x : x;
        System.out.println("x = " + result1);
        char ch = y > 0 ? 'A' : 'B';
        System.out.println("ch = " + ch);
        String str = z > 0 ? "A" : "B";
        System.out.println("str = " + str);
    }
}
