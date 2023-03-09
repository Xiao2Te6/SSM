package asia.xiaoer.ssm.service;

import asia.xiaoer.ssm.domain.Employee;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;

/**
 * @author : XiaoEr
 * @date : 2023/3/9
 */
public interface EmployeeService {

    PageInfo<Employee> getAllEmployee(Integer pageNum);
}
