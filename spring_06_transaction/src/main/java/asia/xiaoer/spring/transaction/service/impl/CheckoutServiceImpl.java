package asia.xiaoer.spring.transaction.service.impl;

import asia.xiaoer.spring.transaction.service.BookService;
import asia.xiaoer.spring.transaction.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author : XiaoEr
 * @date : 2023/2/27
 */
@Service
public class CheckoutServiceImpl implements CheckoutService {

    @Autowired
    BookService bookService;

    //一次性买多本书
    @Override
    // @Transactional
    public void checkout(Integer userId, Integer[] bookIds){
        for (Integer booId : bookIds){
            bookService.byBook(userId, booId);
        }
    }
}
