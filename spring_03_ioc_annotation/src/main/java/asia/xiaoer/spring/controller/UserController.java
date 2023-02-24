package asia.xiaoer.spring.controller;


import asia.xiaoer.spring.service.UserService;
import org.springframework.stereotype.Controller;

/**
 * @author : XiaoEr
 * @date : 2023/2/24
 */
@Controller
public class UserController {

    UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void saveUser() {
        userService.saveUser();
    }
}
