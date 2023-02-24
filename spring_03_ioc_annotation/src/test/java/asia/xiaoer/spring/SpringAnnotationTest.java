package asia.xiaoer.spring;

import asia.xiaoer.spring.controller.UserController;
import asia.xiaoer.spring.dao.UserDao;
import asia.xiaoer.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : XiaoEr
 * @date : 2023/2/24
 */
public class SpringAnnotationTest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring-annotation.xml");
        System.out.println(ioc.getBean(UserController.class));
        System.out.println(ioc.getBean(UserService.class));
        System.out.println(ioc.getBean(UserDao.class));
    }
}
