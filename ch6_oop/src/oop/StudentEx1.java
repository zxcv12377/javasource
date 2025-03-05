package oop;

public class StudentEx1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student(1, 5);
        Student student3 = new Student("s1234567", "홍길동", 2, 3, "010-1234-5678", "hong2@gmail.com");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        student3.changeTel("010-9876-5432");
        System.out.println(student3);
    }
}
