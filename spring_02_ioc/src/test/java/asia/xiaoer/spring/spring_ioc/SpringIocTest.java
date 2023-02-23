package asia.xiaoer.spring.spring_ioc;

import asia.xiaoer.spring.domain.Clazz;
import asia.xiaoer.spring.domain.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : XiaoEr
 * @date : 2023/2/22
 */
public class SpringIocTest {

    @Test
    public void test(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        //通过id获取bean
        Student student = (Student) ioc.getBean("student");

        // //通过类型获取bean
        // Student student2 = ioc.getBean(Student.class);
        //
        // //通过id + 类型 获取bean
        // Student student3 = ioc.getBean("student" ,Student.class);

        System.out.println("student = " + student);
        // System.out.println("student2 = " + student2);
        // System.out.println("student3 = " + student3);
    }

    @Test
    public void test02(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        Clazz clazzThree = ioc.getBean("clazzThree", Clazz.class);
        System.out.println("clazzThree = " + clazzThree);

    }

    @Test
    public void test03(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        Object studentFive = ioc.getBean("studentSix");
        System.out.println("studentFive = " + studentFive);
    }

}