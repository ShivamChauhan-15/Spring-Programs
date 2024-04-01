package com.firstExample.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
//@RequestMapping("/app")      //it is bound to app first app must present in url then other mapping get executed
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @RequestMapping("/login")
    public String login() {
        System.out.println("login");
        return "login";
    }
    @RequestMapping("/userDetails")
    public ModelAndView userDetails(@RequestParam(name = "username")String userName,
                                    @RequestParam(name = "password")String pswrd) {
        ModelAndView model=new ModelAndView("userDetails");
        model.addObject("username", userName);
        model.addObject("password",pswrd);
        return model;
    }
}
