package asia.xiaoer.spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author : XiaoEr
 * @date : 2023/3/7
 */
@Controller
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "hello";
    }
}
