package ch1;

// 주석 ctrl + /
// 자바는 대소문자 구별
// 클래스명은 대문자로 시작, 메소드명, 변수명은 소문자로 시작
// 패키지 : 여러개의 클래스들의 모음
// shift + alt + ↓ 현재 줄 복사

public class VarLongEx1 {
    public static void main(String[] args) {
        long age = 15l, maxSpeed = 100l;
        long max = 256l;
        long money = 100000000000l;
        // System.out.println(age);
        // System.out.println(maxSpeed);

        age = 30;
        System.out.println(money);
        System.out.println("나이: " + age +", 최고속도 :"+ maxSpeed + ", max : " + max);
        System.out.println("나이 + 최고속도 = " + (age + maxSpeed + max));
        
    }   
}