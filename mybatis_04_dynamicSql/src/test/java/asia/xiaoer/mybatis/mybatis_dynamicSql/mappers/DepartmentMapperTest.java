package asia.xiaoer.mybatis.mybatis_dynamicSql.mappers;

import asia.xiaoer.mybatis.mybatis_dynamicSql.domain.Department;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static asia.xiaoer.mybatis.mybatis_dynamicSql.utils.MyBatisUtil.*;

/**
 * @author : XiaoEr
 * @date : 2022/12/4
 */
public class DepartmentMapperTest {

    @Test
    public void selectForConditions() {
        SqlSession sqlSession = getSqlSession();
        DepartmentMapper mapper = sqlSession.getMapper(DepartmentMapper.class);
        List<Department> departments = mapper.selectForConditions(new Department(null, "算法部", "0123t", null));
        departments.forEach(System.out::println);
        close(sqlSession);
    }

    @Test
    public void batchAdd() {
        List<Department> departments = new ArrayList<>();
        departments.add(new Department(null, "java部", "javaT", null));
        departments.add(new Department(null, "内卷部", "nj", null));
        departments.add(new Department(null, "摸鱼部", "my", null));
        departments.add(new Department(null, "算法部", "sf", null));
        departments.add(new Department(null, "公关部", "gg", null));
        SqlSession sqlSession = getSqlSession();
        DepartmentMapper mapper = sqlSession.getMapper(DepartmentMapper.class);
        mapper.batchAdd(departments);
        close(sqlSession);
    }

    @Test
    public void batchDeleteForId() {
        SqlSession sqlSession = getSqlSession();
        DepartmentMapper mapper = sqlSession.getMapper(DepartmentMapper.class);
        mapper.batchDeleteForId(new int[]{6,7,8});
        close(sqlSession);
    }

    @Test
    public void selectOne() {
        SqlSession sqlSession = getSqlSession();
        DepartmentMapper mapper = sqlSession.getMapper(DepartmentMapper.class);
        Department department = mapper.selectOne(2l);
        System.out.println(department);
        close(sqlSession);
    }
}