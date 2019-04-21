package com.atguigu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {
    //@GetMapping
    //@RequestMapping(value="/user/login",method=RequestMethod.POST)
    @PostMapping(value="/user/login")   //处理请求的地址,当前项目下的user下的login页面
    public String login(@RequestParam("username") String username, //从请求参数上获取username和password
                        @RequestParam("password") String password,
                        Map<String,Object> map, HttpSession session){    //map将错误消息封装在里面
        if(!StringUtils.isEmpty(username)&&"123456".equals(password)){
            session.setAttribute("loginUser",username); //只要登陆了用户就会在Session中存在
            //登陆成功，防止表单重复提交，可以重定向到主页
            return "redirect:/main.html";//要去的页面
        }else{
            //登陆失败
            map.put("msg","用户名密码错误");
            return "login";
        }
    }
}
