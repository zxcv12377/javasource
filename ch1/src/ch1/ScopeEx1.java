package ch1;

public class ScopeEx1 {
    public static void main(String[] args) {
        int a = 100;
        {
            int x = 10; // 지역변수
            System.out.println("x = " + x);
            System.out.println("a = " + a);
        }
        // System.out.println("x = " + x);
        System.out.println("a = " + a);

        if (a < 200) {
            int sum = 0;
            System.out.println(sum);
        }

    }
}
