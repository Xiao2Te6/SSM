package asia.xiaoer.spring_mvc.domain;

import lombok.*;

/**
 * @author : XiaoEr
 * @date : 2023/3/2
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class User {
    private Long id;
    private String userName;
    private String password;
}
