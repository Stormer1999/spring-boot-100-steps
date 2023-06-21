package com.in28minute.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


@Controller
@SessionAttributes("name")
public class WelcomeController {

    @GetMapping(value = "/")
    public String gotoWelcomePage(ModelMap model) {
        model.put("name", "stormer");
        return "welcome";
    }
}
