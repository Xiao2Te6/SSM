package asia.xiaoer.spring.controller.impl;

import asia.xiaoer.spring.controller.UserController;
import asia.xiaoer.spring.service.UserService;

/**
 * @author : XiaoEr
 * @date : 2023/2/24
 */
public class UserControllerImpl implements UserController {

    UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void saveUser() {
        userService.saveUser();
    }
}
