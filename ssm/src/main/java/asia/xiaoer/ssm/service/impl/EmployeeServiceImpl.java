package asia.xiaoer.ssm.service.impl;

import asia.xiaoer.ssm.domain.Employee;
import asia.xiaoer.ssm.mapper.EmployeeMapper;
import asia.xiaoer.ssm.service.EmployeeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author : XiaoEr
 * @date : 2023/3/9
 */
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    @Override
    public PageInfo<Employee> getAllEmployee(Integer pageNum) {
        PageHelper.startPage(pageNum,4);
        List<Employee> employeeList = employeeMapper.getAllEmployee();
        PageInfo<Employee> pageInfo = new PageInfo<>(employeeList, 5);
        return pageInfo;
    }
}
