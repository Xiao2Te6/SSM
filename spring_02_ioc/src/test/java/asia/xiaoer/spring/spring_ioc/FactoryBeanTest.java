package asia.xiaoer.spring.spring_ioc;

import asia.xiaoer.spring.domain.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : XiaoEr
 * @date : 2023/2/24
 */
public class FactoryBeanTest {

    @Test
    public void test(){
        User user = new ClassPathXmlApplicationContext("spring-factorybean.xml").getBean(User.class);
        System.out.println("user = " + user);
    }
}
