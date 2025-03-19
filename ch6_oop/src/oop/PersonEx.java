package oop;

public class PersonEx {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("횽길동");
        p1.setPno("123");
        p1.setTel("010-1234-5678");
        System.out.println(p1);
        Person2 p2 = new Person2();
        // p2 = new Person2(null);
        // p2 = new Person2(null, null, null);

        Person2 person2 = Person2.builder()
                .pno("4567")
                .name("상하이")
                .tel("101")
                .build();
        System.out.println(person2);
    }
}
