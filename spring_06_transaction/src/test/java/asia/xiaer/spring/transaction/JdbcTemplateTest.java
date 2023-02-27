package asia.xiaer.spring.transaction;

import asia.xiaoer.spring.transaction.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author : XiaoEr
 * @date : 2023/2/26
 */
@RunWith(SpringJUnit4ClassRunner.class) //指定当前测试类在Spring环境中执行，可以通过注入的方式直接获取IOC容器中的bean
@ContextConfiguration("classpath:spring-jdbctemplate.xml")//设置spring配置文件路径
public class JdbcTemplateTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    //jdbcTemplate的增删改都用的update方法，传入的sql语句不同
    @Test
    public void updateTest(){
        String sql = "insert into t_user value(null, ?, ?)";
        jdbcTemplate.update(sql, "小王" , 100);
    }

    //查询单个对象
    @Test
    public void getUserById(){
        String sql = "select * from t_user where user_id = ?";
        User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), 2);
        System.out.println(user);
    }

    //查询多个对象为一个list
    @Test
    public void getAllUserTest(){
        String sql = "select * from t_user";
        List<User> userList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
        userList.forEach(System.out::println);
    }

    //查询单行单列数据
    @Test
    public void getCountTest(){
        String sql = "select count(*) from t_user";
        System.out.println(jdbcTemplate.queryForObject(sql, Integer.class));
    }

}
