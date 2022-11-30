package xiaoer.asia.mybatis.mybatis_crud.mappers;

import org.apache.ibatis.annotations.Param;
import xiaoer.asia.mybatis.mybatis_crud.domain.Employee;

/**
 * @author : XiaoEr
 * @date : 2022/11/30
 * 演示 获取值的方式
 */
public interface EmployeeMapper {

    /**
     * 实体类类型的参数获取演示
     * @param employee
     */
    void insertEmployee(Employee employee);

    /**
     * 单个字面量类型的参数获取演示
     *  修改员工年龄
     * @param age
     */
    void updateEmployeeAge(int age);

    /**
     * 多个字面量类型的参数获取演示一
     *          通过 arg0,arg1为键取值
     *   修改员工姓名和年龄
     */
    void updateEmployeeAgeByName(String name ,int age);

    /**
     * 多个字面量类型的参数获取演示二
     *          通过 param1,param2为键取值
     *    修改员工姓名、密码、年龄
     */
    void updateEmployeePasswordAndAgeByName(String name ,String password, int age);
    /**
     * 多个字面量类型的参数获取演示三
     *          通过 @Param注解使用自定义键取值 并演示 #{} 和 $
     *    修改员工姓名和密码
     */
    void updateEmployeePasswordByName(@Param("name")String name , @Param("password")String password);

}
