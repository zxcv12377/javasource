package oop;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter // 모든 멤버 변수에 setter 메소드 작성
@ToString

public class Person {
    private String pno;
    private String name;
    private String tel;
}
