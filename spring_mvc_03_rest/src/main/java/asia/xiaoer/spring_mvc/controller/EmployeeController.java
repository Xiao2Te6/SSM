package asia.xiaoer.spring_mvc.controller;

import asia.xiaoer.spring_mvc.dao.EmployeeDaoImpl;
import asia.xiaoer.spring_mvc.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @author : XiaoEr
 * @date : 2023/3/5
 *
 * 由于是演示，所有dao层没有链接数据库且省略了service层
 *
 */
@Controller
public class EmployeeController {

    @Autowired
    EmployeeDaoImpl employeeDao;

    // 查询全部数据√ /employee GET
    @GetMapping("/employee")
    public String getEmployeeList(Model model){
        //查询所有员工信息
        Collection<Employee> employees = employeeDao.getAll();
        //共享到请求域中
        model.addAttribute("employees", employees);
        return "employee_list";
    }

    // 跳转到添加数据页面√ /toAdd GET  (页面控制器中)

    // 执行保存√ /employee POST
    @PostMapping("/employee")
    public String saveEmployee(Employee employee){
        employeeDao.save(employee);
        return "redirect:/employee";
    }

    // 跳转到更新数据页面√ /employee/2 GET
    @GetMapping("/employee/{id}")
    public String toUpdate(@PathVariable("id") Integer id, Model model){
        Employee employee = employeeDao.get(id);
        model.addAttribute("employee", employee);
        return "employee_update";
    }

    // 执行更新√ /employee PUT
    @PutMapping("/employee")
    public String updateEmployee(Employee employee){
        employeeDao.save(employee);
        return "redirect:/employee";
    }

    // 删除√ /employee/2 DELETE
    @DeleteMapping("/employee/{id}")
    public String deleteEmployee(@PathVariable("id") Integer id){
        employeeDao.delete(id);
        System.out.println("id = " + id);
        return "redirect:/employee";
    }
}
