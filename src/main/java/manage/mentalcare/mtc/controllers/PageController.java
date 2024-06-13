package manage.mentalcare.mtc.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/mt_care/")
@Controller
public class PageController {

    @GetMapping("blogpost")
    public String getPosts(){
        return "mental-health";
    }

    @GetMapping("professionals")
    public String getProfessn(){
        return "professn";
    }

    @GetMapping("about")
    public String getAbout(){
        return "about";
    }

    @GetMapping("requestherapy")
    public String getAppointment(){
        return "therapy_ses";
    }

    @GetMapping("profile")
    public String getProfile(){
        return "user_profile";
    }

}
