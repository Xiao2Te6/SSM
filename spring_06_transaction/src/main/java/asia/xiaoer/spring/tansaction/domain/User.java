package asia.xiaoer.spring.tansaction.domain;

import lombok.*;

/**
 * @author : XiaoEr
 * @date : 2023/2/26
 */
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class User {
    private Long userId;
    private String userName;
    private Integer balance;
}
