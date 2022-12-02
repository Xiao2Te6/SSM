package xiaoer.asia.mybatis.mybatis_crud.mappers;

import org.apache.ibatis.annotations.MapKey;
import xiaoer.asia.mybatis.mybatis_crud.domain.Department;

import java.util.List;
import java.util.Map;

/**
 * @author : XiaoEr
 * @date : 2022/12/1
 *
 *  演示：Mybatis的增删改查
 *        Mybatis的部分特殊Sql执行
 */
public interface DepartmentMapper {
    //增
    void insert(Department dept);

    //删
    void delete(Long id);

    //改
    void update(Department dept);

    //查一个实体对象
    Department selectOne(Long id);

    //查所有实体对象，并装在一个List集合中
    List<Department> selectAll();

    //查询单个数据
    int getDeptCount();

    //查询一条数据为map集合
    List<Map<String, Object>> getDeptToMap(Long id);

    /**
     * 查询所有数据为Map集合 方式二
     * 使用@MapKey注解将id作为多条Map结果的键存在大的Map中
     */
    @MapKey("id")
    Map<String, Object> getAllToMap();

    /**********************************************************/

    //模糊查询
    List<Department> fuzzySearch(String keyWord);

    //批量删除
    void  batchDeletion(String ids);

    //动态设置表名，根据表名查询表中所有数据
    List<Department> selectAllForTableName(String tableName);


    //添加使用主键自增，并获取主键
    int insertOne(Department dept);

}
