package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }
    @RequestMapping("/userDetails")
    public ModelAndView userDetails(HttpServletRequest request) {
        ModelAndView model=new ModelAndView("userDetails");
        model.addObject("username", request.getParameter("username"));
        model.addObject("password", request.getParameter("password"));
        return model;
    }
}
