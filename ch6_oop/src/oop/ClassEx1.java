package oop;

// OOP(Object Oriented Programming - 객체지향)
// 재사용성이 높다
// 코드의 관리가 용이하다
// 신뢰성 높은 프로그램을 작성

// 클래스 : 객체 정의, 설계도, 틀
// 클래스 용도 : 객체 생성

// 객체 : 사물, 개념

// 붕어빵 기계(클래스) - 붕어빵(객체)

// 객체와 인스턴스 
// 인스턴스 : 어떤 클래스로부터 만들어진 객체
// 책상은 책상 클래스의 인스턴스다

public class ClassEx1 {
    public static void main(String[] args) {
        // 인스턴스 생성
        // 클래스명 변수명 = new 클래스명()
        Tv tv = new Tv();
        Tv tv2 = new Tv();

        // 속성확인
        System.out.println(tv);
        System.out.println(tv2);

        // 인스턴스 사용
        tv.color = "Black";
        tv.channelUp();
        System.out.println("tv 현재 채널 : " + tv.channel);
        System.out.println("tv 색상 : " + tv.color);

        tv2.power();
        tv2.channel = 8;
        tv2.volume = 22;
        System.out.println(tv2);

    }
}
