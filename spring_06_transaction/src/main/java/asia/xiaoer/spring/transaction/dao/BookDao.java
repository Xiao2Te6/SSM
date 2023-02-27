package asia.xiaoer.spring.transaction.dao;

/**
 * @author : XiaoEr
 * @date : 2023/2/27
 */
public interface BookDao {
    Integer getBookPriceById(Integer bookId);

    void updateBookStock(Integer bookId);

    void updateUserBalance(Integer userId, Integer price);
}
