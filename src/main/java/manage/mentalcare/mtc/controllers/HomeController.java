package manage.mentalcare.mtc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin(origins = "http://localhost:4200")
@Controller
@RequestMapping("/mt_care/")
public class HomeController {

    @GetMapping("relaxaria_welcome")
    public String home(){
        return "index";
    }


    @GetMapping("registr")
    public String getRegist(){
        return "register";
    }

    @GetMapping("signup")
    public String getSign(){
        return "signin";
    }

}
