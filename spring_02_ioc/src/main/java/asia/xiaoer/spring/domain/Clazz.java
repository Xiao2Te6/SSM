package asia.xiaoer.spring.domain;

import lombok.*;

import java.util.List;

/**
 * @author : XiaoEr
 * @date : 2023/2/23
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Clazz {
    private Long cid;
    private String name;
    private List<Student> students;
}
