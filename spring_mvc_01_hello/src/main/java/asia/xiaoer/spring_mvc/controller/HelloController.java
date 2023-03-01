package asia.xiaoer.spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : XiaoEr
 * @date : 2023/3/1
 */
@Controller
public class HelloController {

    @RequestMapping("/") //浏览器请求路径和RequestMapping中属性一致，该请求会被此方法拦截处理
    public String portal(){
        /**
         * return 返回逻辑视图
         *  物理视图 src/main/webapp/WEB-INF/templates/index.html
         *  逻辑视图 index （去掉视图前缀和视图后缀）
         */
        return "index";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

}
