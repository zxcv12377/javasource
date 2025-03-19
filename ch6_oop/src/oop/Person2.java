package oop;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor // @NonNull (+ final) 이 들어간 변수를 포함한 생성자
@Getter
@ToString

public class Person2 {
    @Setter // 해당하는 멤버변수의 setter 메소드만 생성
    private String pno;
    @NonNull
    private String name;
    private String tel;
}
