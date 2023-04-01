package toyProject.webService.join;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import toyProject.webService.main.userJPA.jpaService;

@Controller
public class JoinController {

    @Autowired
    jpaService jpaService;

    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("name", "Hello World!");
        return "hello";
    }

    @PostMapping("/join")
//    @ResponseBody
    public String join(UserVO joinvo) {
        System.out.println("joinvo.getUsername() = " + joinvo.getUsername());
        System.out.println("joinvo.getEmail() = " + joinvo.getEmail());
        System.out.println("joinvo.getPassword() = " + joinvo.getPassword());
        joinvo.setId("test");
        boolean isSuccess = jpaService.doInsert(joinvo);
        if(isSuccess){
            return "mainPage";
        }else{
            return "mainPage";
        }
    }
}
