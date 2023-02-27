package asia.xiaoer.spring.transaction.service.impl;

import asia.xiaoer.spring.transaction.dao.BookDao;
import asia.xiaoer.spring.transaction.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.TimeUnit;

/**
 * @author : XiaoEr
 * @date : 2023/2/27
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookDao bookDao;

    @Override
    @Transactional(
            // readOnly = true

            // timeout = 3

            // noRollbackFor = ArithmeticException.class //不因为算术异常回滚
            // noRollbackForClassName = "java.long.ArithmeticException" //不因为算术异常回滚

            // isolation = Isolation.DEFAULT//使用数据库默认的隔离级别
            // isolation = Isolation.READ_UNCOMMITTED//读未提交
            // isolation = Isolation.READ_COMMITTED//读已提交
            // isolation = Isolation.REPEATABLE_READ//可重复读
            // isolation = Isolation.SERIALIZABLE//串行化

            // propagation = Propagation.REQUIRED 默认传播行为
            propagation = Propagation.REQUIRES_NEW

    )
    public void byBook(Integer userId, Integer bookId) {
        // //睡眠3秒
        // try {
        //     TimeUnit.SECONDS.sleep(5);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
        //查询图书价格
        Integer price =  bookDao.getBookPriceById(bookId);
        //更新图书库存
        bookDao.updateBookStock(bookId);
        //更新用户余额
        bookDao.updateUserBalance(userId,price);
    }
}
