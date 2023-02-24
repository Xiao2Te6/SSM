package asia.xiaoer.spring.process;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author : XiaoEr
 * @date : 2023/2/23
 */
public class MyBeanProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("生命周期第三步：bean的后置处理器处理初始化之前的操作");
        return bean;
    }
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("生命周期第五步：bean的后置处理器处理初始化之后的操作");
        return bean;
    }
}

