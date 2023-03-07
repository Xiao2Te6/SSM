package asia.xiaoer.spring_mvc.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author : XiaoEr
 * @date : 2023/3/7
 */
@ControllerAdvice //将当前类标识为一个异常处理的组件
public class ExceptionController {

    @ExceptionHandler //用于设置所标识方法处理的异常
    public String exceptionHandler(ArithmeticException ex, Model model){
        //ex表示当前请求中出现的异常对象
        model.addAttribute("ex", ex);
        return "error";
    }
}
