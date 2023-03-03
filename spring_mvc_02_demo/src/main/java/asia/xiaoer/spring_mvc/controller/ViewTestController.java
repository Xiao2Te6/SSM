package asia.xiaoer.spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : XiaoEr
 * @date : 2023/3/3
 */

@Controller
public class ViewTestController {

    //ThymeleafView测试
    @RequestMapping("/test/view/thymeleaf")
    public String thymeleafViewTest(){
        return "hello";
    }

    //转发视图测试
    @RequestMapping("/test/view/forward")
    public String forwardTest(){
        return "forward:/test/model";
    }

    //重定向视图测试
    @RequestMapping("/test/view/redirect")
    public String redirectTest(){
        return "redirect:/test/model";
    }

}
