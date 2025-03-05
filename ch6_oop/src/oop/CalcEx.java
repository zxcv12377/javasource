package oop;

public class CalcEx {
    public static void main(String[] args) {
        Calc clac = new Calc();
        System.out.println(clac.add(45, 15));
        System.out.println(clac.subtract(3, 2));
        System.out.println(clac.multiply(5, 10));
        System.out.println(clac.divide(41, 3));
        System.out.println();
        System.out.println(clac.max(5, 10));
        System.out.println(clac.min(5, 10));
    }
}
