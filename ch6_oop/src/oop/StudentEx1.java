package oop;

public class StudentEx1 {
    public static void main(String[] args) {
        // Student student1 = new Student();
        // Student student2 = new Student(1, 5);
        Student student3 = new Student("s1234567", "홍길동", 2, 3, "010-1234-5678", "hong2@gmail.com");
        Student student4 = new Student("s7654321", "김길자", 2, 9, "010-8765-4321", "kim2@gmail.com");

        // System.out.println(student1);
        // System.out.println(student2);
        // System.out.println(student3);

        // System.out.println("===========================");
        // System.out.println("아이디 : " + student3.getStuId());
        // System.out.println("이름 : " + student3.getName());
        // System.out.println("학년 : " + student3.getGrade());
        // System.out.println("반 : " + student3.getClassNum());
        // System.out.println("전화번호 : " + student3.getPhone());
        // System.out.println("이메일 : " + student3.getEmail());
        // System.out.println("===========================");
        // System.out.println("===========================");
        // System.out.println("아이디 : " + student4.getStuId());
        // System.out.println("이름 : " + student4.getName());
        // System.out.println("학년 : " + student4.getGrade());
        // System.out.println("반 : " + student4.getClassNum());
        // System.out.println("전화번호 : " + student4.getPhone());
        // System.out.println("이메일 : " + student4.getEmail());
        // System.out.println("===========================");
        studentInfo(student3);
        studentInfo(student4);
        // System.out.println(student3);
    }

    public static void studentInfo(Student stu) {
        System.out.println("===========================");
        System.out.println("아이디 : " + stu.getStuId());
        System.out.println("이름 : " + stu.getName());
        System.out.println("학년 : " + stu.getGrade());
        System.out.println("반 : " + stu.getClassNum());
        System.out.println("전화번호 : " + stu.getPhone());
        System.out.println("이메일 : " + stu.getEmail());
        System.out.println("===========================");
        System.out.println();
    }
}
