package asia.xiaoer.mybatis.mybatis_cache.doman;

import lombok.*;

import java.io.Serializable;
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
public class Department implements Serializable {
    private Long id;
    private String name;
    private String sn;
    private List<Employee> employees;

}
