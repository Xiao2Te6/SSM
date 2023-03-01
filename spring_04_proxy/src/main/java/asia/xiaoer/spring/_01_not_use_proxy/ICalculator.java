package asia.xiaoer.spring._01_not_use_proxy;

/**
 * @author : XiaoEr
 * @date : 2023/2/25
 *
 * 计算器接口，实现加、减、乘、除功能
 */
public interface ICalculator {

    int add(int i, int j);
    int sub(int i, int j);
    int mul(int i, int j);
    int div(int i, int j);

}
