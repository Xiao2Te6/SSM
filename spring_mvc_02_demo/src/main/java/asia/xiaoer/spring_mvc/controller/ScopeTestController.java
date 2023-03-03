package asia.xiaoer.spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author : XiaoEr
 * @date : 2023/3/3
 */
@Controller
public class ScopeTestController {

    /**
     * ModelAndView有Model和View的功能
     *  Model:主要用于向请求域共享数据
     *  View:主要用于设置视图，实现页面跳转
     */
    @RequestMapping("/test/mav")
    public ModelAndView modelAndViewTest(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("requestScopeTest","hello,ModelAndView");
        mav.setViewName("hello");
        return mav;
    }

    @RequestMapping("/test/model")
    public String modelTest(Model model){
        model.addAttribute("requestScopeTest","hello,Model");
        return "hello";
    }

    @RequestMapping("/test/modelMap")
    public String modelMapTest(ModelMap modelMap){
        modelMap.addAttribute("requestScopeTest","hello,ModelMap");
        return "hello";
    }

    @RequestMapping("/test/map")
    public String mapTest(Map<String, Object> map){
        map.put("requestScopeTest","hello,Map");
        return "hello";
    }

    @RequestMapping("/test/session")
    public String sessionScopeTest(HttpSession session){
        session.setAttribute("sessionScopeTest","hello,session");
        return "hello";
    }


    @RequestMapping("/test/application")
    public String applicationScopeTest(HttpSession session){
        ServletContext apploction = session.getServletContext();
        apploction.setAttribute("applicationScopeTest","hello,application");
        return "hello";
    }


}
