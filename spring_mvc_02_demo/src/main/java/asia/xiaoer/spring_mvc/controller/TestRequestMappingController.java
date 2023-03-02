package asia.xiaoer.spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author : XiaoEr
 * @date : 2023/3/1
 */
@Controller
// @RequestMapping("/test")
public class TestRequestMappingController {

    //RequestMapping注解属性测试
    @RequestMapping(value = {"/hello","/abc"},
                    method = {RequestMethod.POST, RequestMethod.GET},
                    // params = {"user","!password","age=20","id!=2"},
                    headers = {"referer"}
    )
    public String hello(){
        return "hello";
    }

    //SpringMVC支持ant风格的路径测试
    @RequestMapping(
                    // "/ant/te?t/hello" // ？可以匹配任意单个字符
                    // "/ant/te*t/hello" // *可以匹配任意个数(0个或多个)的任意字符
                    "/ant/**/hello" // **可以匹配任意层数的任意目录（得写在一层目录中）
    )
    public String antTest(){
        return "hello";
    }


    @RequestMapping("/log/{username}/{password}")
    public String restTest(@PathVariable("username") String username,@PathVariable("password") String password){
        System.out.println("username = " + username);
        System.out.println("password = " + password);
        return "hello";
    }
}
