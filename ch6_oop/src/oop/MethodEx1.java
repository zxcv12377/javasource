package oop;

import java.util.Arrays;

public class MethodEx1 {
    public static void main(String[] args) {
        Method method = new Method();
        System.out.println(method.add(1, 2));
        System.out.println(method.add2(1, 2.5f));
        method.print("홍길동", "s123");
        int[] array1 = { 1, 2, 3 };
        int[] arr2 = method.arr(array1);
        System.out.println(Arrays.toString(arr2));
    }
}
