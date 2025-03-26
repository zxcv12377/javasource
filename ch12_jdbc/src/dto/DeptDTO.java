package dto;

import lombok.*;

// ~~DTO : Data Transfer Object - 메소드에서 데이터를 담아서 전달하는 객체
// ~~DAO : Data Access Object - DB 작업을 모아놓은 객체
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class DeptDTO {
    private int deptnop;
    private String dname;
    private String loc;
}
