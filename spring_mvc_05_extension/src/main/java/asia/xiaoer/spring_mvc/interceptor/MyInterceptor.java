package asia.xiaoer.spring_mvc.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author : XiaoEr
 * @date : 2023/3/7
 */
@Component
public class MyInterceptor implements HandlerInterceptor {

    //前置拦截器，在控制方法运行前运行
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle执行");
        //返回true放行，false不放行
        return true;
    }

    //后置拦截器，在控制方法运行后运行
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle执行");
    }

    //完成拦截器，在控制方法完成且视图渲染完成后运行
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion执行");
    }
}
