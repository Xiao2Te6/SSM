package asia.xiaoer.mybatis.mybatis_resultmap.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * 用于获取mybatis sqlSession 和关闭 sqlSession
 */
public class MyBatisUtil {
    private static SqlSessionFactory sqlSessionFactory;
    private MyBatisUtil() {
    }

    static{
        try {
            //加载mybatis主配置文件
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
            //获取SqlSession工厂（类似于连接池）
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取一个开放的SqlSession
     * @return 工厂生产的一个sql连接会话对象
     */
    public static SqlSession getSqlSession(){
        //通过工厂获取一个开放的SqlSession（会话）
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        return sqlSession;

    }

    /**
     * 关闭会话资源
     * @param sqlSession  需要关闭的资源对象
     */
    public static void close(SqlSession sqlSession){
        if(sqlSession != null){
            sqlSession.close();
        }
    }
}
