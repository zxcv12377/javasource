package ch1;

// 주석 ctrl + /
// 자바는 대소문자 구별
// 클래스명은 대문자로 시작, 메소드명, 변수명은 소문자로 시작
// 패키지 : 여러개의 클래스들의 모음
// shift + alt + ↓ 현재 줄 복사


public class VarByteEx1 {
    public static void main(String[] args) {

        // 최종 상수명 = 값 / final int MAX_VALUE = 100;
        byte age = 15, maxSpeed = 100;
        // System.out.println(age);
        // System.out.println(maxSpeed);

        System.out.println("나이: " + age +", 최고속도 :"+ maxSpeed);
        System.out.println("나이 + 최고속도" + (age + maxSpeed));

        System.out.printf("나이: %d, 최고속도 : %d\n", age, maxSpeed);
    }   
}