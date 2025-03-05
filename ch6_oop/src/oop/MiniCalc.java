package oop;

// 매서드 종류

// 1. 인스턴트 메서드 : 클래스 영역 / 인스턴스가 생성되었을 때 (new구문 사용시)
// 2. 클래스 메서드 : 클래스 영역 static / 클래스가 메모리에 올라갔을 때 (클래스 작성이 완료시)

// 같은 클래스 내에서 다른 메서드 호출 가능 - 이름 사용
// static , non-static : 생성되는 시기가 다르기때문에 호출 시점을 따져야 함

// non-static : static , non-static 사용가능

public class MiniCalc {

    static int k;
    int a, b;

    // 클래스 메서드
    static void print() {
        // this.a = 7;
        k = 0;
    }

    int plus(int x, int y) {
        this.a = 7;
        k = 0;
        return x + y;
    }

    double avg(int x, int y) {
        double sum = plus(x, y);
        return sum / 2;
    }

    void execute() {
        double result = avg(7, 10);
        println("실행 결과" + result);
    }

    void println(String msg) {
        System.out.println(msg);
    }
}
