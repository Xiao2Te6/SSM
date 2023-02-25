package aisa.xiaoer.spring._03_dynamic_proxy;
;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;


/**
 * @author : XiaoEr
 * @date : 2023/2/25
 *
 * jdk的动态代理演示
 */
public class ProxyFactory {

    Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxy(){

        /**
         * Proxy.newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h):获取一个代理对象
         *      ClassLoader loader: 类加载器-->系统加载器 SystemClassLoader
         *      Class<?>[] interfaces: 被代理类实现的所有接口数组；
         *      InvocationHandler h：处理代理类核心方法的处理程序
         *           invoke(Object proxy, Method method, Object[] args)
         *                proxy：代理对象
         *                method：代理对象需要实现的方法，即其中需要重写的方法
         *                args：method所对应方法的参数
         */
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                                      target.getClass().getInterfaces(),
                (Object proxy, Method method, Object[] args)-> {

                    Object invoke = null;
                    try {
                        System.out.println("[日志] " + method.getName() + " 方法开始了，参数是：" + Arrays.asList(args));

                        invoke = method.invoke(target, args);

                        System.out.println("[日志] div 方法结束了，结果是：" + invoke);
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        System.out.println(method.getName() + "方法运行完毕");
                    }
                    return invoke;
                });

    }
}
