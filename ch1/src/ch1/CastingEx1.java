package ch1;
// 형변환
public class CastingEx1 {
    public static void main(String[] args) {

        double d = 85.4;
        System.out.println("d = " + d);
        int score = (int)d;
        System.out.println("score = " + score);

        int intValue = 10;
        double dblValue = 5.5;
        int result = (int)(intValue + dblValue);
        // int result = ntValue + (int)dblValue;
        //System.out.println("result = " + result);
        System.out.printf("result = " + result);

        float f1 = 9.1234567f;
        double d1 = 9.1234567;

        double d2 = f1;
        double result2 = d1 + f1;
        System.out.println(d2);
        System.out.println(result2);

        int num = 97;
        char ch1 = (char)num;
        System.out.println(ch1);
        
    }
}
