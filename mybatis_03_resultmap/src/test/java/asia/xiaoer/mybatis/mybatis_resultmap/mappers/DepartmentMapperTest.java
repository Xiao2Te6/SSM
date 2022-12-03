package asia.xiaoer.mybatis.mybatis_resultmap.mappers;

import asia.xiaoer.mybatis.mybatis_resultmap.domain.Department;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import static asia.xiaoer.mybatis.mybatis_resultmap.utils.MyBatisUtil.*;
import static org.junit.Assert.*;

/**
 * @author : XiaoEr
 * @date : 2022/12/3
 */
public class DepartmentMapperTest {

    @Test
    public void selectDepartmentAndEmployee() {
        SqlSession sqlSession = getSqlSession();
        DepartmentMapper mapper = sqlSession.getMapper(DepartmentMapper.class);
        Department department = mapper.selectDepartmentAndEmployee(2l);
        System.out.println(department);
        close(sqlSession);
    }

    @Test
    public void selectOneForSubStep() {
        SqlSession sqlSession = getSqlSession();
        DepartmentMapper mapper = sqlSession.getMapper(DepartmentMapper.class);
        Department department = mapper.selectOneForSubStep(2l);
        System.out.println(department);
        close(sqlSession);
    }
}