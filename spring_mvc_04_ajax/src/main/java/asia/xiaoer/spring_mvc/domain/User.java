package asia.xiaoer.spring_mvc.domain;

import lombok.*;

/**
 * @author : XiaoEr
 * @date : 2023/3/6
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class User {

    private Integer id;
    private String username;
    private String password;
    private Integer age;
    private String gender;
}
