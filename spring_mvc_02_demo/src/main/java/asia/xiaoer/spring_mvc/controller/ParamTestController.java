package asia.xiaoer.spring_mvc.controller;

import asia.xiaoer.spring_mvc.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @author : XiaoEr
 * @date : 2023/3/2
 */
@Controller
public class ParamTestController {

    //通过servletAPI获取请求参数
    @RequestMapping("/param/servletAPI")
    public String servletAPITest(HttpServletRequest servletRequest){
        servletRequest.getSession();
        String username = servletRequest.getParameter("username");
        String password = servletRequest.getParameter("password");
        System.out.println("username = " + username);
        System.out.println("password = " + password);
        return "hello";
    }

    // //通过参数获取请求参数
    // @RequestMapping("/param")
    // public String paramTest(String username, String password){
    //     System.out.println("username = " + username);
    //     System.out.println("password = " + password);
    //     return "hello";
    // }

    // //通过@RequestParam 注解+参数 获取请求参数
    // @RequestMapping("/param")
    // public String paramTest(@RequestParam(value = "userName", required = true, defaultValue = "hello") String username,
    //                         String password
    // ){
    //     System.out.println("username = " + username);
    //     System.out.println("password = " + password);
    //     return "hello";
    // }

    //通过实体类获取参数
    @RequestMapping("/param")
    public String paramTest(User user){
        String username = user.getUserName();
        String password = user.getPassword();
        System.out.println("username = " + username);
        System.out.println("password = " + password);
        return "hello";
    }

    @RequestMapping("/header")
    public String requestHeaderTest(@RequestHeader("referer") String referer,
                                    @CookieValue("JSESSIONID") String jsessionId
    ){
        System.out.println("referer = " + referer);
        System.out.println("jsessionId = " + jsessionId);
        return "hello";
    }



}
