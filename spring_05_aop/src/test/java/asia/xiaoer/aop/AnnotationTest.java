package asia.xiaoer.aop;

import asia.xiaoer.spring.aop.annotation.ICalculator;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : XiaoEr
 * @date : 2023/2/25
 */
public class AnnotationTest {

    @Test
    public void test(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring-aop-annotation.xml");
        ICalculator calculator = ioc.getBean(ICalculator.class);
        calculator.add(1, 1);
        // calculator.div(1, 0);
    }
}
