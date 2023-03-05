package asia.xiaoer.spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author : XiaoEr
 * @date : 2023/3/4
 *
 */
@Controller
public class RestTestController {

    //查询所有用户信息 --> /user --> get
    // @RequestMapping(value = "/user", method = RequestMethod.GET)
    @GetMapping("/user")
    public String getUserList(){
        System.out.println("查询所有用户信息 --> /user --> get");
        return "hello";
    }

    //根据id查询用户信息 --> /user/1 --> get
    // @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    @GetMapping ( "/user/{id}")
    public String getUserById(@PathVariable("id") String id){
        System.out.println("根据id查询用户信息 --> /user/"+id+" --> get");
        return "hello";
    }

    //保存用户信息  -->  /user --> post
    // @RequestMapping(value = "/user", method = RequestMethod.POST)
    @PostMapping ( "/user")
    public String saveUser(){
        System.out.println("保存用户信息  -->  /user --> post");
        return "hello";
    }

    //更新用户信息 -->  /user --> put
    // @RequestMapping(value = "/user", method = RequestMethod.PUT)
    @PutMapping("/user")
    public String updateUser(){
        System.out.println("更新用户信息 --> /user --> put");
        return "hello";
    }

    //删除用户信息 -->  /user/2 --> delete
    // @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable("id") String id){
        System.out.println("删除用户信息 --> /user/"+id+" --> delete");
        return "hello";
    }

}
