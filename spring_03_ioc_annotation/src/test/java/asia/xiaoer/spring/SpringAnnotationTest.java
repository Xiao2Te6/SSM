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

    /**
     *
     * 标识组件和扫描测试
     * @Component：将类标识为普通组件
     * @Controller：将类标识为控制层组件
     * @Service：将类标识为业务层组件
     * @Repository：将类标识为持久层组件
     *
     * 通过标注这几个注解交给容器bean id为类名的小驼峰形式，可以设置注解的value自定义id
     */
    @Test
    public void test(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring-annotation.xml");
        System.out.println(ioc.getBean(UserController.class));
        System.out.println(ioc.getBean(UserService.class));
        System.out.println(ioc.getBean(UserDao.class));
    }

    /**
     * 基于注解的自动装配
     *   在成员变量上直接标记@Autowired注解即可完成自动装配，不需要提供setter()方法（@Autowired注解可以标记在构造器和setter方法上）
     *
     */
    @Test
    public void test2(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring-annotation.xml");
        ioc.getBean(UserController.class).saveUser();
    }
}
