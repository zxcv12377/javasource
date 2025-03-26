package dto.emp;

import lombok.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder

public class EmpDTO {
    private int empNo;
    private String eName;
    private String job;
    private int mgr;
    private String hireDate;
    private int sal;
    private int comm;
    private int deptNo;
}
