package asia.xiaoer.spring.spring_ioc;

import asia.xiaoer.spring.domain.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : XiaoEr
 * @date : 2023/2/23
 */
public class LiftCycleTest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring-liftcycle.xml");
        User user = ioc.getBean(User.class);
        System.out.println("user = " + user);
        ioc.close();
    }
}
