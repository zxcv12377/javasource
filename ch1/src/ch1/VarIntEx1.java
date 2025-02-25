package ch1;

// 주석 ctrl + /
// 자바는 대소문자 구별
// 클래스명은 대문자로 시작, 메소드명, 변수명은 소문자로 시작
// 패키지 : 여러개의 클래스들의 모음
// shift + alt + ↓ 현재 줄 복사

public class VarIntEx1 {
    public static void main(String[] args) {
        int age = 15, maxSpeed = 100;
        int max = 256;
        // System.out.println(age);
        // System.out.println(maxSpeed);

        age = 30;

        System.out.println("나이: " + age +", 최고속도 :"+ maxSpeed + ", max : " + max);
        System.out.println("나이 + 최고속도 = " + (age + maxSpeed + max));

        // 형식화된 출력
        // %b : boolean(boolean)
        // %d : 10진수(byte, short, int, long)
        // %f : 실수(float, double)
        // %s : 문자열(string)
        // %c : 문자(char)
        System.out.printf("나이: %d, 최고속도 : %d, max : %d\n" , age, maxSpeed, max);
        System.out.printf("나이: %10d, 최고속도 : %d, max : %d\n" , age, maxSpeed, max);

    }   
}