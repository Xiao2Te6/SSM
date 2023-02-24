package asia.xiaoer.spring.dao.impl;

import asia.xiaoer.spring.dao.UserDao;

/**
 * @author : XiaoEr
 * @date : 2023/2/24
 */
public class UserDaoImpl implements UserDao {

    @Override
    public void saveUser() {
        System.out.println("User保存成功");
    }
}
