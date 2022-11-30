package xiaoer.asia.mybatis.mybatis_crud.domain;

import lombok.*;

/**
 * @author : XiaoEr
 * @date : 2022/11/30
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
    private int age;
    private Long dept_id;
}
