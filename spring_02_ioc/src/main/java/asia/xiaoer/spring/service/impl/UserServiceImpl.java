package asia.xiaoer.spring.service.impl;

import asia.xiaoer.spring.dao.UserDao;
import asia.xiaoer.spring.service.UserService;

/**
 * @author : XiaoEr
 * @date : 2023/2/24
 */
public class UserServiceImpl implements UserService {

    UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void saveUser() {
        userDao.saveUser();
    }
}
