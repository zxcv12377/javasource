package api.util;

import java.util.ArrayList;
import java.util.List;

import api.object.Person;

public class ListEx3 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("hong12", "홍길동"));
        people.add(new Person("kim12", "김길동"));
        people.add(new Person("kang12", "강길동"));
        people.add(new Person("choi12", "최길동"));
        people.add(new Person("park12", "박길동"));

        for (Person person : people) {
            System.out.println(person); // person.toString()
        }

        // 아이디 이름
        // --------------------
        // hong12 홍길동

        System.out.println("아이디 \t 이름");
        System.out.println("----------------------");
        for (Person person : people) {
            System.out.printf("%s \t %s\n", person.getId(), person.getName());
        }
        System.out.println("----------------------");
    }
}
