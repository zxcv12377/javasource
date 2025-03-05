package oop;

// 메소드 : 리턴타입 메소드명(){}
// 리턴(반환) 타입 : 기본타입(정수, 불린, 문자, 실수), 객체(대문자로 시작)타입. 배열, void(리턴 타입 없음)

public class Method {

    int method1() {
        int sum = 15;
        return sum;
    }

    String method2() {
        String str = "Hello";
        return str;
    }

    double method3() {
        int sum1 = 15;
        return sum1;
    }

    char method4() {
        return 'A';
    }

    void method5() {
        // return;
    }

    int add(int x, int y) {
        return x + y;
    }

    float add2(int x, float y) {
        return x + y;
    }

    void print(String name, String id) {
        System.out.println(name + " : " + id);
    }

    int[] arr(int[] arr1) {

        return arr1;
    }

    Card method6() {
        return null;
    }
}
