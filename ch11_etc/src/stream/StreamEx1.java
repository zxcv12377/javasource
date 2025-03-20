package stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("홍길동", "성춘향", "김자바");

        // Iterator
        // Iterator<String> iterator = list.iterator();
        // while (iterator.hasNext()) {
        // String str = iterator.next();
        // }
        // Stream
        Stream<String> stream = list.stream();
        stream.forEach(s -> System.out.println(s));

        List<Student> students = Arrays.asList(
                new Student("홍길동", 90),
                new Student("신철용", 75));
        Stream<Student> stream2 = students.stream();
        stream2.forEach(student -> {
            String name = student.getName();
            int math = student.getMath();
            System.out.println(name + " : " + math);
        });

        students.stream().forEach(stu -> System.out.println(stu));
    }
}
