package asia.xiaoer.mybatis.mybatis_demo.domain;

import lombok.*;

/**
 * @author : XiaoEr
 * @date : 2022/11/11
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class User {
    private Integer id;
    private String name;
    private Integer age;
    private String gender;
}



