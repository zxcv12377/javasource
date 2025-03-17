package generics;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + "]";
    }
}

class Worker extends Person {
    public Worker(String name) {
        super(name);
    }
}

class HighStudent extends Student {
    public HighStudent(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class Student extends Person {
    public Student(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class Course<T> {
    private String name;
    private List<T> students;

    public Course(String name, int capacity) {
        this.name = name;
        this.students = new ArrayList<>(capacity);
    }

    public void add(T t) {
        this.students.add(t);
    }

    public String getName() {
        return name;
    }

    public List<T> getStudents() {
        return students;
    }

}

class CoursEx {
    public static void main(String[] args) {
        Course<Person> personCourse = new Course<>("일반인과정", 20);
        personCourse.add(new Person("홍길동"));
        personCourse.add(new Worker("김도비"));
        personCourse.add(new Student("방장"));
        personCourse.add(new HighStudent("이꼴초"));
        registerCourse(personCourse);

        Course<Worker> workerCourse = new Course<>("직장인과정", 10);
        workerCourse.add(new Worker("최도비"));
        registerCourseWorker(workerCourse);
        registerCourse(workerCourse);

        Course<Student> studentCourse = new Course<>("학생과정", 5);
        studentCourse.add(new Student("강기"));
        registerCourse(studentCourse);
        registerCourseStudent(studentCourse);

        Course<HighStudent> hightCourse = new Course<>("고등학생과정", 5);
        hightCourse.add(new HighStudent("피존투"));
        registerCourse(hightCourse);
        registerCourseStudent(hightCourse);
    }

    static void registerCourse(Course<?> course) {
        // 모든 과정 등록
        System.out.println(course.getName() + " 수강생 " + course.getStudents());
    }

    static void registerCourseStudent(Course<? extends Student> course) {
        // Student와 HighStudent 등록
        System.out.println(course.getName() + " 수강생 " + course.getStudents());
    }

    static void registerCourseWorker(Course<? super Worker> course) {
        // Worker이거나 Person 등록
        System.out.println(course.getName() + " 수강생 " + course.getStudents());
    }
}
