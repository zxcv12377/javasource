package oop;

// static 메서드 : 클래스 메서드

public class PrimitiveParamEX {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 100;
        System.out.println("main() : x = " + d.x);
        // change(d.x);
        change2(d);
        System.out.println("After change()");
        System.out.println(d.x);
        // PrimitiveParamEX obj = new PrimitiveParamEX();
        // obj.change();
    }

    static void change(int x) {
        x = 10000;
        System.out.println("chaner() : x = " + x);
    }

    static void change2(Data data) {
        data.x = 10000;
        System.out.println("chaner() : x = " + data.x);
    }
}
