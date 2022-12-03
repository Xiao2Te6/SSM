package asia.xiaoer.mybatis.mybatis_resultmap.mappers;

import asia.xiaoer.mybatis.mybatis_resultmap.domain.Department;
import asia.xiaoer.mybatis.mybatis_resultmap.domain.Employee;

/**
 * @author : XiaoEr
 * @date : 2022/12/2
 */
public interface DepartmentMapper {

    //使用association分布查询员工和员工所在部门 第二步
    Department selectOne(Long id);

    //使用collection查询部门和部门中的所有员工
    Department selectDepartmentAndEmployee(Long id);

    //使用collection分步查询部门和部门中的所有员工 第一步
    Department selectOneForSubStep(Long id);
}
