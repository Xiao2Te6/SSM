package asia.xiaoer.mybatis.mybatis_resultmap.mappers;


import asia.xiaoer.mybatis.mybatis_resultmap.domain.Employee;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import static asia.xiaoer.mybatis.mybatis_resultmap.utils.MyBatisUtil.*;

/**
 * @author : XiaoEr
 * @date : 2022/12/2
 */
public class EmployeeMapperTest {

    @Test
    public void selectOne() {
        SqlSession sqlSession = getSqlSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee employee = mapper.selectOne(2l);
        System.out.println("employee = " + employee);
        sqlSession.close();
    }

    @Test
    public void selectOneForSubStep() {
        SqlSession sqlSession = getSqlSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee employee = mapper.selectOneForSubStep(2l);
        System.out.println("employee = " + employee);
        sqlSession.close();
    }
}