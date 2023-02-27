package asia.xiaoer.spring.transaction.controller;

import asia.xiaoer.spring.transaction.service.BookService;
import asia.xiaoer.spring.transaction.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author : XiaoEr
 * @date : 2023/2/27
 */
@Controller
public class BookController {

    @Autowired
    BookService bookService;

    @Autowired
    CheckoutService checkoutService;

    public void byBook(Integer userId, Integer bookId) {
        bookService.byBook(userId, bookId);

    }

    public void checkout(Integer userId, Integer[] bookIds){
        checkoutService.checkout(userId, bookIds);
    }
}
