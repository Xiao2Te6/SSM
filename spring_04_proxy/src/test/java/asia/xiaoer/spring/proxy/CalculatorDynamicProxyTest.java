package asia.xiaoer.spring.proxy;

import asia.xiaoer.spring._03_dynamic_proxy.CalculatorImpl;
import asia.xiaoer.spring._03_dynamic_proxy.ICalculator;
import asia.xiaoer.spring._03_dynamic_proxy.ProxyFactory;
import org.junit.Test;

/**
 * @author : XiaoEr
 * @date : 2023/2/25
 */
public class CalculatorDynamicProxyTest {

    @Test
    public void test(){
        ICalculator proxy = (ICalculator) new ProxyFactory(new CalculatorImpl()).getProxy();
        proxy.add(1, 3);
        // proxy.div(1, 0);
    }
}
