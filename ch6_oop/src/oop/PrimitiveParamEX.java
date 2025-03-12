package oop;

// static 메서드 : 클래스 메서드

public class PrimitiveParamEx {

    public static void main(String[] args) {
        // main 메서드
        Data d = new Data();
        d.x = 100;
        System.out.println("main() : x = " + d.x);
        // 값 복사
        change(d.x);
        // 주소 복사
        change2(d);
        System.out.println("After change() ");
        System.out.println(d.x);
        // PrimitiveParamEx obj = new PrimitiveParamEx();
        // obj.change();
    }

    static void change(int x) {
        x = 10000;
        System.out.println("change() : x = " + x);
    }

    static void change2(Data d) {
        d.x = 10000;
        System.out.println("change() : d.x = " + d.x);
    }
}
