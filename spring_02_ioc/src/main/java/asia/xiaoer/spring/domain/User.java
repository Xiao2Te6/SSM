package asia.xiaoer.spring.domain;

/**
 * @author : XiaoEr
 * @date : 2023/2/23
 */
public class User {
    private Long id;
    private String name;

    public User() {
        System.out.println("生命周期第一步：实例化");
    }

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        System.out.println("生命周期第二步：依赖注入");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void init() {
        System.out.println("生命周期第四步：初始化");
    }

    public void destroy() {
        System.out.println("生命周期第六步：销毁");
    }

}
