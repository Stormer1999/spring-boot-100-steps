package com.in28minute.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


@Controller
@SessionAttributes("name")
public class LoginController {

    private final AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        super();
        this.authenticationService = authenticationService;
    }

    @GetMapping(value = "/login")
    public String gotoLoginPage() {
        return "login";
    }


    @PostMapping(value = "login")
    //login?name=Ranga RequestParam
    public String gotoWelcomePage(@RequestParam String name,
                                  @RequestParam String password, ModelMap model) {
        if (authenticationService.authenticate(name, password)) {

            model.put("name", name);
            return "welcome";
        }
        model.put("errorMessage", "Invalid Credentials");
        return "login";
    }
}
