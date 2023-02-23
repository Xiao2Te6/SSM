package asia.xiaoer.spring.spring_ioc;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

/**
 * @author : XiaoEr
 * @date : 2023/2/23
 */
public class DataBaseTest {

    @Test
    public void test(){
        DataSource dataSource = new ClassPathXmlApplicationContext("spring-database.xml").getBean(DataSource.class);
        System.out.println("dataSource = " + dataSource);
    }
}
