package com.blodbank.Controller;

import com.blodbank.Service.SignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.time.LocalDate;

@Controller
public class BloodBankController {
    @Autowired
    private DataSource dataSource;
    @Autowired
    private SignupService service;
    @RequestMapping("/")
    public String signup(){
        return "signup";
    }
    @RequestMapping(value = "/register")
    public String register(@RequestParam(name = "username")String username,
                         @RequestParam(name="name")String name,
                         @RequestParam(name = "dob")String dob1,
                         @RequestParam(name = "role")String role,
                         @RequestParam(name = "password")String password) throws SQLException {
        System.out.println("In request param");
        LocalDate dob=LocalDate.parse(dob1);
        service.setUp(username,name,dob,role,password);
        return "signup";
    }
}
