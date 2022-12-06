package asia.xiaoer.mybatis.mybatis_dynamicSql.mappers;

import asia.xiaoer.mybatis.mybatis_dynamicSql.domain.Department;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author : XiaoEr
 * @date : 2022/12/4
 */
public interface DepartmentMapper {

    //使用if标签根据传入条件查询符合的部门
    List<Department> selectForConditionsOne(Department dept);


    //使用where优化，根据传入条件查询符合的部门
    List<Department> selectForConditionsTwo(Department dept);

    //使用trim优化，根据传入条件查询符合的部门
    List<Department> selectForConditionsThree(Department dept);


    /**
     * 演示choose标签、when标签、otherwise标签
     *      根据传入的多个条件查询符合 其一 的部门
     */
    List<Department> selectForConditions(Department dept);

    //使用foreach标签进行批量添加
    void batchAdd(@Param(value = "departments")List<Department> departments);

    //使用foreach标签进行批量删除
    void batchDeleteForId(@Param(value = "ids")int[] ids);

    //使用Sql标签演示
    Department selectOne(Long id);

}
