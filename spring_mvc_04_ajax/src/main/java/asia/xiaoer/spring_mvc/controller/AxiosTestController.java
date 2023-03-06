package asia.xiaoer.spring_mvc.controller;

import asia.xiaoer.spring_mvc.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

/**
 * @author : XiaoEr
 * @date : 2023/3/5
 */
@Controller
public class AxiosTestController {

    /**
     * 测试ajax
     * @param id request请求地址中拼接的参数
     * @param requestBody 标记接受请求体的参数，并将请求体中的参数处理成对应格式
     * @param response 响应到前端的响应体
     * @throws IOException 使用io流向响应体中写入数据时的异常
     */
    @PostMapping("/test/ajax")
    public void ajaxTest(Integer id, @RequestBody String requestBody, HttpServletResponse response) throws IOException {
        System.out.println("id = " + id);
        System.out.println("requestBody = " + requestBody);
        response.getWriter().println("hello,axios");
    }

    // //测试 @RequestBody 注解将请求体中的参数处理成实体类对象
    // @PostMapping("/test/RequestBody")
    // public String requestBodyTest(@RequestBody User user){
    //     System.out.println("user = " + user);
    //     return "hello";
    // }

    //测试 @RequestBody 注解将请求体中的参数处理成map对象
    @PostMapping("/test/RequestBody")
    public String requestBodyTest(@RequestBody Map<String, Object> map){
        System.out.println("map = " + map);
        return "hello";
    }

    //测试 @RequestBody 注解作用
    @GetMapping("/test/ResponseBody")
    @ResponseBody
    public String responseBodyTest(){
        return "hello";
    }

    // //测试 @RequestBody 注解 将 实体类对象转换为Json格式响应给前端
    // @GetMapping("/test/ResponseBody/json")
    // @ResponseBody
    // public User responseBodyJsonTest(){
    //     return new User(1, "admin", "123", 20, "男");
    // }

    // //测试 @RequestBody 注解 将 Map对象转换为Json格式响应给前端
    // @GetMapping("/test/ResponseBody/json")
    // @ResponseBody
    // public Map<String, User> responseBodyJsonTest(){
    //     User user1 = new User(1, "admin1", "123", 20, "男");
    //     User user2 = new User(2, "admin2", "321", 19, "女");
    //     User user3 = new User(3, "admin3", "132", 19, "男");
    //     Map<String, User> map = new HashMap();
    //     map.put("user1", user1);
    //     map.put("user2", user2);
    //     map.put("user3", user3);
    //     return map;
    // }

    //测试 @RequestBody 注解 将 List对象转换为Json格式响应给前端
    @GetMapping("/test/ResponseBody/json")
    @ResponseBody
    public List<User> responseBodyJsonTest(){
        User user1 = new User(1, "admin1", "123", 20, "男");
        User user2 = new User(2, "admin2", "321", 19, "女");
        User user3 = new User(3, "admin3", "132", 19, "男");
        return Arrays.asList(user1, user2, user3);
    }
}
