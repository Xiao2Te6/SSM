package asia.xiaoer.spring_mvc.domain;

import lombok.*;

/**
 * @author : XiaoEr
 * @date : 2023/3/5
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Employee {

    private Integer id;
    private String lastName;
    private String email;
    //1 male, 0 female
    private Integer gender;

}
