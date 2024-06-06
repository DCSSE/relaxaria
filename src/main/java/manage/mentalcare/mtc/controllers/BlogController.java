package manage.mentalcare.mtc.controllers;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/mt_care/")
@Controller
public class BlogController {

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

}
