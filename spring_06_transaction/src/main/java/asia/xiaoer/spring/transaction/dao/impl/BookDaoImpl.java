package asia.xiaoer.spring.transaction.dao.impl;

import asia.xiaoer.spring.transaction.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author : XiaoEr
 * @date : 2023/2/27
 */
@Repository
public class BookDaoImpl implements BookDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public Integer getBookPriceById(Integer bookId) {
        String sql = "select price from t_book where book_id = ?";
        Integer price = jdbcTemplate.queryForObject(sql, Integer.class, bookId);
        return price;
    }

    @Override
    public void updateBookStock(Integer bookId) {
        String sql = "update t_book set stock = stock - 1 where book_id = ?";
        jdbcTemplate.update(sql, bookId);

    }

    @Override
    public void updateUserBalance(Integer userId, Integer price) {
        String sql = "update t_user set balance = balance - ? where user_id = ?";
        jdbcTemplate.update(sql, price,userId);
    }
}
