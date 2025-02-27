package loop;

public class ForEx5 {
    public static void main(String[] args) {
        // 1)3의 배수의 총합
        int result1 = 0;
        for (int i = 3; i < 100; i += 3) {
            result1 += i;
        }
        // 2) 3의 배수는 더하고 9의 배수는 뺀 총합
        int result2 = 0;
        for (int i = 3; i < 100; i += 3) {
            if (i % 9 != 0) {
                result2 += i;
            }
        }
        // 3) 3의 배수와 5의 배수의 총합

        int result3 = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                result3 += i;
        }
        // int sum = 0;
        // for (int i = 1; i <= 100; i++) {
        // if(i % 5 == 0){
        // sum += i;
        // }

        // }

        System.out.println("");
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        // System.out.println(sum);
    }
}
