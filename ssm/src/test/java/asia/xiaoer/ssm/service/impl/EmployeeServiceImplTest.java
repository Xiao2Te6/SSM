package asia.xiaoer.ssm.service.impl;

import asia.xiaoer.ssm.domain.Employee;
import asia.xiaoer.ssm.service.EmployeeService;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author : XiaoEr
 * @date : 2023/3/9
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class EmployeeServiceImplTest {

    @Autowired
    EmployeeService employeeService;

    @Test
    public void getAllEmployee() {
        PageInfo<Employee> allEmployee = employeeService.getAllEmployee(1);
        List<Employee> list = allEmployee.getList();
        list.stream().forEach(System.out::println);
    }
}