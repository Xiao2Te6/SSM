package asia.xiaoer.spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : XiaoEr
 * @date : 2023/3/1
 */
@Controller
public class PortalController {

    @RequestMapping("/")
    public String portal(){
        return "index";
    }
}
