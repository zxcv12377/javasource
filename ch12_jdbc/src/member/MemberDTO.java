package member;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder

public class MemberDTO {
    private int no;
    private String id;
    private String name;
    private String addr;
    private String email;
    private int age;
}
