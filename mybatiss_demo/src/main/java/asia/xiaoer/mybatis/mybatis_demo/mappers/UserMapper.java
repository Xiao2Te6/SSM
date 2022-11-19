package asia.xiaoer.mybatis.mybatis_demo.mappers;

import asia.xiaoer.mybatis.mybatis_demo.domain.User;

import java.util.List;

/**
 * @author : XiaoEr
 * @date : 2022/11/11
 */
public interface UserMapper {

    int insertUser();

    int updateUser();

    int deleteOne();

    int deleteAll();

    User selectOne();

    List<User> selectAll();

}
