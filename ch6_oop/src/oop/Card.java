package oop;

// 변수 종류

// 1. 지역변수 : 메서드, 생성자, 초기화 블럭 내부 / 변수 선언문이 실행될 때
// 2. 인스턴스 변수 : 클래스 영역 / 인스턴스가 생성되었을 때 (new구문 사용시)
// 3. 클래스 변수 : 클래스 영역 static / 클래스가 메모리에 올라갔을 때 (클래스 작성이 완료시)

public class Card {
    // 멤버 (인스턴스)변수
    String kind;
    int number;

    // 클래스 변수
    // 카드 공통 속성
    static int width = 100;
    static int height = 250;

    @Override
    public String toString() {
        return "Card [kind=" + kind + ", number=" + number + "]";
    }

}
