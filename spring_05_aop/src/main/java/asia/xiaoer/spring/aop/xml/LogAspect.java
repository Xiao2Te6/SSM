package asia.xiaoer.spring.aop.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author : XiaoEr
 * @date : 2023/2/25
 *
 * 日志切面增强
 */
@Component
public class LogAspect {

    //前置通知
    public void beforeAdviceMethod(JoinPoint joinPoint){

        //获取方法签名，再获取方法名称
        String name = joinPoint.getSignature().getName();

        //获取参数列表
        Object[] args = joinPoint.getArgs();
        System.out.println("LogAspect-->前置通知：" + name + "方法开始了，参数是" + Arrays.toString(args));
    }

    //返回通知
    public void afterReturningMethod(JoinPoint joinPoint, Object result){
        String name = joinPoint.getSignature().getName();
        System.out.println("LogAspect-->返回通知：" + name + "方法运行完成，结果是" + result);
    }

    //后置通知
    public void afterAdviceMethod(JoinPoint joinPoint){
        //获取方法签名，再获取方法名称
        String name = joinPoint.getSignature().getName();

        System.out.println("LogAspect-->后置通知：" + name + "方法运行完毕");
    }

    //异常通知
    public void afterThrowingMethod(JoinPoint joinPoint, Exception e){
        //获取方法签名，再获取方法名称
        String name = joinPoint.getSignature().getName();

        System.out.println("LogAspect-->异常通知：" + name + "方法运行失败：" + e);
    }

    //环绕通知(写法和动态代理类)
    public Object aroundMethod(ProceedingJoinPoint proceedingJoinPoint){

        Object result = null;
        String name = null;
        try {
            name = proceedingJoinPoint.getSignature().getName();
            Object[] args = proceedingJoinPoint.getArgs();

            System.out.println("LogAspect-->环绕通知-->前置通知：" + name + "方法开始，参数是" + Arrays.toString(args));

            //表示目标方法的执行（被代理对象核心方法执行）
            result = proceedingJoinPoint.proceed();

            System.out.println("LogAspect-->环绕通知-->返回通知：" + name + "方法运行完成，结果是" + result);

        } catch (Throwable e) {
            System.out.println("LogAspect-->环绕通知-->异常通知：" + name + "方法运行失败：" + e);
        } finally {
            System.out.println("LogAspect-->环绕通知-->后置通知：" + name + "方法运行完毕");
        }
        return result;
    }

}
