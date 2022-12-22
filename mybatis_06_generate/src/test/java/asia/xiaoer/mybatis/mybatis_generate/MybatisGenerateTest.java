package asia.xiaoer.mybatis.mybatis_generate;

import static asia.xiaoer.mybatis.mybatis_generate.utils.MyBatisUtil.*;

import asia.xiaoer.mybatis.mybatis_generate.domain.Employee;
import asia.xiaoer.mybatis.mybatis_generate.domain.EmployeeExample;
import asia.xiaoer.mybatis.mybatis_generate.mappers.EmployeeMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author : XiaoEr
 * @date : 2022/12/21
 *
 * mybatis逆向工程测试
 */
public class MybatisGenerateTest {

    @Test
    public void test(){
        SqlSession sqlSession = getSqlSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);

        //根据条件查询 没有条件则查询所有
        List<Employee> employees = mapper.selectByExample(null);
        employees.stream().forEach(System.out::println);
        System.out.println("**************");

        //根据条件查询， 名字中带有高的并且年龄在18岁的员工，或者id大于等于5的

        EmployeeExample employeeExample = new EmployeeExample();
        employeeExample.createCriteria().andNameLike("高").andAgeIn(Arrays.asList(new Integer[]{18}));

        employeeExample.or().andIdGreaterThanOrEqualTo(4l);

        List<Employee> employees1 = mapper.selectByExample(employeeExample);
        employees1.stream().forEach(System.out::println);


        close(sqlSession);
    }

}
