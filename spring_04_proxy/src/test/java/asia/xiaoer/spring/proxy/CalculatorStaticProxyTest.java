package asia.xiaoer.spring.proxy;

import asia.xiaoer.spring._02_static_proxy.CalculatorImpl;
import asia.xiaoer.spring._02_static_proxy.CalculatorStaticProxy;
import org.junit.Test;

/**
 * @author : XiaoEr
 * @date : 2023/2/25
 */
public class CalculatorStaticProxyTest {

    /**
     * 使用静态代理的计算机日志测试
     */
    @Test
    public void test(){
        CalculatorStaticProxy calculatorStaticProxy = new CalculatorStaticProxy(new CalculatorImpl());
        calculatorStaticProxy.add(1, 2);
    }

    @Test
    public void test02(){
        CalculatorStaticProxy calculatorStaticProxy = new CalculatorStaticProxy(new CalculatorImpl());
        calculatorStaticProxy.div(1, 0);
    }
}
