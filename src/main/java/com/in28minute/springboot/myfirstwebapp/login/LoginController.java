package com.in28minute.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {

    @RequestMapping("/login")
    public String gotoLoginPage(@RequestParam(required = false) String name, ModelMap model) {
        model.put("name", name);
        return "login";
    }
}
