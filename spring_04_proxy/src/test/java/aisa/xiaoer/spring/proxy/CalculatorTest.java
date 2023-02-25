package aisa.xiaoer.spring.proxy;

import aisa.xiaoer.spring._01_not_use_proxy.CalculatorImpl;
import org.junit.Test;

/**
 * @author : XiaoEr
 * @date : 2023/2/25
 */
public class CalculatorTest {

    /**
     * 不使用代理测试 动态代理
     */
    @Test
    public void test01(){
        CalculatorImpl calculator = new CalculatorImpl();
        calculator.add(1, 2);
    };


}
