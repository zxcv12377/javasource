package solocoding;

public class LoopMethod {
    public static void main(String[] args) {
        int a = 1, b = 1, sum = 0;
        sum = plus(a, b);

        System.out.println(sum);
    }
    public static int plus(int a, int b){
        if(a > 5) return a;
        a += b;
        return plus(a, b);
    }
}
