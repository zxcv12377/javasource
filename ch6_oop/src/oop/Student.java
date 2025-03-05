package oop;

public class Student {
    // 멤버 변수, 멤버 메소드, 생성자

    // 속성 : 학번, 이름, 학년, 반, 전화번호, 이메일
    String stuId;
    String name;
    int grade;
    int classNum;
    String phone;
    String email;

    // 생성자(Constructor) : 개발자가 명시하지 않으면 컴파일러가 자동으로 default 생성자 만들어 줌
    public Student() { // default 생성자(기본 생성자)

    }

    // 생성자의 목적 : 멤버 변수의 초기화
    public Student(int grade, int classNum) {
        this.grade = grade;
        this.classNum = classNum;
    }

    public Student(String stuId, String name, int grade, int classNum, String phone, String email) {
        this.stuId = stuId;
        this.name = name;
        this.grade = grade;
        this.classNum = classNum;
        this.phone = phone;
        this.email = email;
    }

    // 기능 : 전화번호 변경, 이메일 변경, 학년 변경, 반 변경

    public void changeTel(String phone) {
        this.phone = phone;
    }

    public void changeEmail(String email) {
        this.email = email;
    }

    public void changeGrade(int grade) {
        this.grade = grade;
    }

    public void chagneClassNum(int classNum) {
        this.classNum = classNum;
    }

    @Override
    public String toString() {
        return "Student [stuId=" + stuId + ", name=" + name + ", grade=" + grade + ", classNum=" + classNum + ", phone="
                + phone + ", email=" + email + "]";
    }
}
