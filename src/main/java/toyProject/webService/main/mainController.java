package toyProject.webService.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class mainController {

    @RequestMapping("/")
    public String goMainPage(Model model){
        System.out.println("##### goMainPage!!!");
        return "mainPage"; // temploates 하위 mainPage.html 로 넘어가도록 처리
    }
}
