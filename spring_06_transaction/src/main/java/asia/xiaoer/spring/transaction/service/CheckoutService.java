package asia.xiaoer.spring.transaction.service;

/**
 * @author : XiaoEr
 * @date : 2023/2/27
 */
public interface CheckoutService {
  void checkout(Integer userId, Integer[] bookIds);
}
