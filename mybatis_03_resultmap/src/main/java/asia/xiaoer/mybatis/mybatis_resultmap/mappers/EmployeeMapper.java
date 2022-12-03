package asia.xiaoer.mybatis.mybatis_resultmap.mappers;

import asia.xiaoer.mybatis.mybatis_resultmap.domain.Employee;

import java.util.List;

/**
 * @author : XiaoEr
 * @date : 2022/12/2
 */
public interface EmployeeMapper {

    Employee selectOne(Long id);

    //使用association分布查询员工和员工所在部门 第一步
    Employee selectOneForSubStep(Long id);

    //使用collection分步查询部门和部门中的所有员工 第二步
    List<Employee> selectEmployeeForSubStep(Long deptId);
}
