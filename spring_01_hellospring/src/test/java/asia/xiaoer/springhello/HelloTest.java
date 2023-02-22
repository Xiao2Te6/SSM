package asia.xiaoer.springhello;

import asia.xiaoer.springhello.domain.Hello;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : XiaoEr
 * @date : 2023/2/22
 */
public class HelloTest {

    @Test
    public void test(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Hello hello = (Hello) ioc.getBean("hello");
        hello.say();
    }
}
