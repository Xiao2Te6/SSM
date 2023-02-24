package asia.xiaoer.spring.factory;

import asia.xiaoer.spring.domain.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author : XiaoEr
 * @date : 2023/2/24
 *
 * FactoryBean是个接口，需要提供一个实现类
 *  	1. getObject()：返回一个对象交给IOC管理
 *  	2.  getObjectType()：设置所返回对象的类型
 *  	3. isSingleton()：设置所返回的对象是否单例
 */
public class UserFactoryBean implements FactoryBean<User> {

    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
