package asia.xiaoer.spring.domain;

import lombok.*;

import java.util.Map;

/**
 * @author : XiaoEr
 * @date : 2023/2/22
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {

    private Long sn;
    private String name;
    private Integer age;
    private Double score;
    private String[] hobby;
    private Clazz clazz;
    private Map<String, Teacher> teachers;
}
