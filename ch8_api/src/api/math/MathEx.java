package api.math;

public class MathEx {
    public static void main(String[] args) {
        double val = 90.7552;

        System.out.println("random() 0 ~ 1 " + Math.random());
        System.out.println(Math.ceil(val));
        System.out.println(Math.floor(val));
        System.out.println(Math.round(val));
        System.out.println(Math.min(val, 95.25));
        System.out.println(Math.max(val, 95.25));
    }
}
