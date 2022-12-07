package asia.xiaoer.mybatis.mybatis_cache.mappers;

import asia.xiaoer.mybatis.mybatis_cache.doman.Department;

/**
 * @author : XiaoEr
 * @date : 2022/12/7
 */
public interface DepartmentMapper {

    //根据id查询一个部门
    Department selectOne(Long id);

    //修改部门
    void update(Department dept);
}
