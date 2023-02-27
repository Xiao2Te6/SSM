package asia.xiaoer.spring.transaction.domain;

import lombok.*;

/**
 * @author : XiaoEr
 * @date : 2023/2/26
 */
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Book {
    private Integer bookId;
    private String bookName;
    private Integer price;
    private Integer stock;
}
