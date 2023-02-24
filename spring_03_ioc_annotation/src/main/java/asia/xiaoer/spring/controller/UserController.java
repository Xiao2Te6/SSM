package asia.xiaoer.spring.controller;


import asia.xiaoer.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author : XiaoEr
 * @date : 2023/2/24
 */
@Controller("userController")
public class UserController {

    @Autowired
    UserService userService;

    // @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void saveUser() {
        userService.saveUser();
    }
}
