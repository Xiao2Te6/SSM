package aisa.xiaoer.spring._02_static_proxy;

/**
 * @author : XiaoEr
 * @date : 2023/2/25
 *
 * 使用静态代理为计算器的加、减、乘、除、方法添加日志
 *      代理模式可以在核心代码前、后、异常时、方法执行完毕时这4个地方添加业务代码
 */
public class CalculatorStaticProxy implements ICalculator{

    ICalculator target;

    public CalculatorStaticProxy(ICalculator calculator) {
        this.target = calculator;
    }

    @Override
    public int add(int i, int j) {
        // 附加的日志功能由代理类中的代理方法来实现
        System.out.println("[日志] add 方法开始了，参数是：" + i + "," + j);

        // 通过目标对象来实现核心业务逻辑
        int addResult = target.add(i, j);

        System.out.println("[日志] add 方法结束了，结果是：" + addResult);

        return addResult;
    }

    @Override
    public int sub(int i, int j) {
        return 0;
    }

    @Override
    public int mul(int i, int j) {
        return 0;
    }

    @Override
    public int div(int i, int j) {
        int divResult = 0;
        try {
            // 附加的日志功能由代理类中的代理方法来实现
            System.out.println("[日志] div 方法开始了，参数是：" + i + "," + j);

            // 通过目标对象来实现核心业务逻辑
            divResult = target.div(i, j);

            System.out.println("[日志] div 方法结束了，结果是：" + divResult);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("div计算完毕");
        }

        return divResult;
    }
}
