package oop;

public class MyMathEx {

    public static void main(String[] args) {
        MyMath myMath = new MyMath();
        int[] arr = { 3, 4, 5 };
        System.out.println(myMath.add(15, 25));
        System.out.println(myMath.add(15L, 25));
        System.out.println(myMath.add(15, 25L));
        System.out.println(myMath.add(arr));
    }
}
