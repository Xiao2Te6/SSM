package asia.xiaoer.mybatis.mybatis_resultmap.domain;

import lombok.*;

import java.util.List;

/**
 * @author : XiaoEr
 * @date : 2022/11/30
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Department {
    private Long id;
    private String name;
    private String sn;
    private List<Employee> employees;

}
