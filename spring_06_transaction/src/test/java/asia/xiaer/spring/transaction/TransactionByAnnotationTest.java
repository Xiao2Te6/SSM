package asia.xiaer.spring.transaction;

import asia.xiaoer.spring.transaction.controller.BookController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author : XiaoEr
 * @date : 2023/2/27
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-tx-annotation.xml")
public class TransactionByAnnotationTest {

    @Autowired
    BookController bookController;

    @Test
    public void test(){
        bookController.byBook(1, 1);
    }

    @Test
    public void testCheckout(){
        bookController.checkout(1, new Integer[]{1,2});
    }
}
