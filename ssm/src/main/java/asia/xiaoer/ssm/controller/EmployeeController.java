package asia.xiaoer.ssm.controller;

import asia.xiaoer.ssm.domain.Employee;
import asia.xiaoer.ssm.service.EmployeeService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author : XiaoEr
 * @date : 2023/3/9
 *
 *
 * 查询所有员工 /employee --> get
 * 分页查询所有员工 /employee/page/1 --> get
 * 查询指定员工 /employee/1 --> get
 * 跳转修改页面 /to/add --> get
 * 跳转新增页面 /to/update --> get
 * 新增员工 /employee --> post
 * 修改员工信息 /employee/1 --> put
 * 删除员工 /employee --> delete
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // 分页查询所有员工 /employee/page/1 --> get
    @GetMapping("/employee/page/{pageNum}")
    public String getAllEmployees(@PathVariable("pageNum") Integer pageNum, Model model){
        System.out.println("pageNum = " + pageNum);
        PageInfo<Employee> pageInfo =  employeeService.getAllEmployee(pageNum);
        System.out.println("pageInfo = " + pageInfo);
        model.addAttribute("pageInfo", pageInfo);
        return "employee_list";
    }
}
