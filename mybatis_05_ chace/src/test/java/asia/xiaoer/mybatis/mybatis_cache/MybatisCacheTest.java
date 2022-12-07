package asia.xiaoer.mybatis.mybatis_cache;

import asia.xiaoer.mybatis.mybatis_cache.doman.Department;
import asia.xiaoer.mybatis.mybatis_cache.mappers.DepartmentMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import static asia.xiaoer.mybatis.mybatis_cache.utils.MyBatisUtil.close;
import static asia.xiaoer.mybatis.mybatis_cache.utils.MyBatisUtil.getSqlSession;
import static org.junit.Assert.*;

/**
 * @author : XiaoEr
 * @date : 2022/12/7
 */
public class MybatisCacheTest {

    /**
     * Mybatis 一级缓存测试
     *       虽然查询了两次但只执行了一次sql
     */
    @Test
    public void cacheTest() {
        SqlSession sqlSession = getSqlSession();
        DepartmentMapper mapper = sqlSession.getMapper(DepartmentMapper.class);
        //第一次查询
        Department department = mapper.selectOne(1l);
        System.out.println("department = " + department);

        //第二次查询
        Department department1 = mapper.selectOne(1l);
        System.out.println("department1 = " + department1);

        close(sqlSession);
    }

    /**
     * Mybatis 一级缓存失效演示
     *       虽然查询了两次但只执行了一次sql
     */
    @Test
    public void cacheTest2() {
        SqlSession sqlSession = getSqlSession();
        DepartmentMapper mapper = sqlSession.getMapper(DepartmentMapper.class);
        //第一次查询
        Department department = mapper.selectOne(1l);
        System.out.println("department = " + department);

        // //执行修改操作
        // mapper.update(new Department(3l, "摸鱼鱼部" , "myy" ,null));

        //清除缓存
        sqlSession.clearCache();

        //第二次查询
        Department department1 = mapper.selectOne(1l);
        System.out.println("department1 = " + department1);

        close(sqlSession);
    }

    //mybatis 二级缓存演示
    @Test
    public void cacheTest3(){

        //第一次查询
        SqlSession sqlSession = getSqlSession();
        DepartmentMapper mapper = sqlSession.getMapper(DepartmentMapper.class);

        Department department = mapper.selectOne(1l);
        System.out.println("department = " + department);

        close(sqlSession);

        //第二次查询
        SqlSession sqlSession1 = getSqlSession();
        DepartmentMapper mapper1 = sqlSession1.getMapper(DepartmentMapper.class);


        Department department1 = mapper1.selectOne(1l);
        System.out.println("department1 = " + department1);

        close(sqlSession1);
    }
}