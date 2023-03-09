package asia.xiaoer.ssm.domain;

import lombok.*;

/**
 * @author : XiaoEr
 * @date : 2023/3/9
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Employee {

    private Long id;
    private String name;
    private String password;
    private String email;
    private Integer age;
    private Long deptId;

}
