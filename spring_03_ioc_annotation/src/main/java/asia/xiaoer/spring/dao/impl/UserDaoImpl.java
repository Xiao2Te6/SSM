package asia.xiaoer.spring.dao.impl;


import asia.xiaoer.spring.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author : XiaoEr
 * @date : 2023/2/24
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public void saveUser() {
        System.out.println("User保存成功");
    }
}
