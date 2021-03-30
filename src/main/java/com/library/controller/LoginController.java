package com.library.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author ：Vizzk
 * @description：登陆控制器
 * @date ：2021/3/29 17:11
 */
@Controller
public class LoginController {

    @RequestMapping("/login")
    public ModelAndView login(String account, String password, Boolean isManager){
        ModelAndView model;
        if(isManager){
            model = new ModelAndView("/managerLogin");
        }
        else {
            model = new ModelAndView("/studentLogin");
        }
        model.addObject("account",account);
        model.addObject("password",password);
        return model;
    }
}
