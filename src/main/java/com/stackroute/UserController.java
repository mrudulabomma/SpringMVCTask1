package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class UserController {
    @RequestMapping("/")

    protected ModelAndView login(@ModelAttribute("user")User user) throws Exception {
        ModelAndView mv=new ModelAndView();
        mv.setViewName("display");
       user.setName("bellam");
        mv.addObject("result",user.getName());
        return mv;
    }
}
