package asia.xiaoer.spring.service.impl;


import asia.xiaoer.spring.dao.UserDao;
import asia.xiaoer.spring.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author : XiaoEr
 * @date : 2023/2/24
 */
@Service
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
