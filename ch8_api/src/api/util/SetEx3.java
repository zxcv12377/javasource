package api.util;

import java.util.HashSet;
import java.util.Set;

import api.object.Person;

public class SetEx3 {
    public static void main(String[] args) {
        Set<Person> people = new HashSet<>();
        people.add(new Person("hong12", "홍길동"));
        people.add(new Person("kim12", "김길동"));
        people.add(new Person("kang12", "강길동"));
        people.add(new Person("choi12", "최길동"));
        people.add(new Person("park12", "박길동"));
        people.add(new Person("park12", "박길동"));

        for (Person person : people) {
            System.out.println(person); // person.toString()
        }
        System.out.println(new Person("hong12", "홍길동").hashCode());
        System.out.println(new Person("hong12", "홍길동").hashCode());
    }
}
