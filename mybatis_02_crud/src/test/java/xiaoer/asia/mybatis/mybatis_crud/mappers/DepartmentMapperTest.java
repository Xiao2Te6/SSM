package xiaoer.asia.mybatis.mybatis_crud.mappers;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import xiaoer.asia.mybatis.mybatis_crud.domain.Department;

import java.util.List;
import java.util.Map;

import static xiaoer.asia.mybatis.mybatis_crud.utils.MyBatisUtil.*;


/**
 * @author : XiaoEr
 * @date : 2022/12/1
 */
public class DepartmentMapperTest {

    @Test
    public void insert() {
        SqlSession sqlSession = getSqlSession();
        DepartmentMapper mapper = sqlSession.getMapper(DepartmentMapper.class);
        mapper.insert(new Department(2l,"奋斗部","0123t"));
        close(sqlSession);
    }

    @Test
    public void delete() {
        SqlSession sqlSession = getSqlSession();
        DepartmentMapper mapper = sqlSession.getMapper(DepartmentMapper.class);
        mapper.delete(20l);
        close(sqlSession);
    }

    @Test
    public void update() {
        SqlSession sqlSession = getSqlSession();
        DepartmentMapper mapper = sqlSession.getMapper(DepartmentMapper.class);
        mapper.update(new Department(2l,"算法部","0123t"));
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

    @Test
    public void selectAll() {
        SqlSession sqlSession = getSqlSession();
        DepartmentMapper mapper = sqlSession.getMapper(DepartmentMapper.class);
        List<Department> departments = mapper.selectAll();
        departments.forEach(System.out::println);
        close(sqlSession);
    }

    @Test
    public void getDeptCount() {
        SqlSession sqlSession = getSqlSession();
        DepartmentMapper mapper = sqlSession.getMapper(DepartmentMapper.class);
        int deptCount = mapper.getDeptCount();
        System.out.println(deptCount);
        close(sqlSession);
    }

    @Test
    public void getDeptToMap() {
        SqlSession sqlSession = getSqlSession();
        DepartmentMapper mapper = sqlSession.getMapper(DepartmentMapper.class);
        List<Map<String, Object>> deptToMap = mapper.getDeptToMap(2l);
        System.out.println(deptToMap);
        close(sqlSession);
    }

    @Test
    public void getAllToMap() {
        SqlSession sqlSession = getSqlSession();
        DepartmentMapper mapper = sqlSession.getMapper(DepartmentMapper.class);
        Map<String, Object> allToMap = mapper.getAllToMap();
        System.out.println(allToMap);
        close(sqlSession);
    }

    @Test
    public void fuzzySearch() {
        SqlSession sqlSession = getSqlSession();
        DepartmentMapper mapper = sqlSession.getMapper(DepartmentMapper.class);
        List<Department> departments = mapper.fuzzySearch("0");
        departments.forEach(System.out::println);
        close(sqlSession);
    }

    @Test
    public void batchDeletion() {
        SqlSession sqlSession = getSqlSession();
        DepartmentMapper mapper = sqlSession.getMapper(DepartmentMapper.class);
        mapper.batchDeletion("18,19,20");
        close(sqlSession);
    }

    @Test
    public void selectAllForTableName() {
        SqlSession sqlSession = getSqlSession();
        DepartmentMapper mapper = sqlSession.getMapper(DepartmentMapper.class);
        List<Department> departments = mapper.selectAllForTableName("department");
        departments.forEach(System.out::println);
        close(sqlSession);
    }

    @Test
    public void insertOne() {
        SqlSession sqlSession = getSqlSession();
        DepartmentMapper mapper = sqlSession.getMapper(DepartmentMapper.class);
        int i = mapper.insertOne(new Department(null, "摸鱼部", "0123t"));
        close(sqlSession);
    }
}