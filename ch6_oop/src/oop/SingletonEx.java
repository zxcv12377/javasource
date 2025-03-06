package oop;

public class SingletonEx {
    public static void main(String[] args) {
        // Singleton singleton = new Singleton();
        Student student1 = new Student();
        Student student2 = new Student();
        System.out.println(student1 == student2 ? "같은 객체" : "다른 객체");
        Singleton singleton1 = Singleton.getIstance();
        Singleton singleton2 = Singleton.getIstance();
        System.out.println(singleton1 == singleton2 ? "같은 객체" : "다른 객체");
    }
}
