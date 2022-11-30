package xiaoer.asia.mybatis.mybatis_crud.mappers;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import xiaoer.asia.mybatis.mybatis_crud.domain.Employee;

import static xiaoer.asia.mybatis.mybatis_crud.utils.MyBatisUtil.*;

/**
 * @author : XiaoEr
 * @date : 2022/11/30
 */
public class EmployeeMapperTest {

    @Test
    public void insertEmployee() {
        SqlSession sqlSession = getSqlSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        mapper.insertEmployee(new Employee(3l, "何zy", "1234", "123@qq.com", 23, 4l));
        close(sqlSession);
    }

    @Test
    public void updateEmployeeAge() {
        SqlSession sqlSession = getSqlSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        mapper.updateEmployeeAge(10);
        close(sqlSession);
    }

    @Test
    public void updateEmployeeAgeByName() {
        SqlSession sqlSession = getSqlSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        mapper.updateEmployeeAgeByName("何zy", 88);
        close(sqlSession);
    }

    @Test
    public void updateEmployeePasswordAndAgeByName() {
        SqlSession sqlSession = getSqlSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        mapper.updateEmployeePasswordAndAgeByName("何zy", "123456", 33);
        close(sqlSession);
    }

    @Test
    public void updateEmployeePasswordByName() {
        SqlSession sqlSession = getSqlSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        mapper.updateEmployeePasswordByName("何zy", "9080");
        close(sqlSession);
    }
}