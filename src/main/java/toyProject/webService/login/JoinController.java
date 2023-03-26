package toyProject.webService.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JoinController {

    @Autowired
    joinService joinservice;

    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("name", "Hello World!");
        return "hello";
    }

    @PostMapping("/join")
    @ResponseBody
    public void join(joinVO joinvo) {
        System.out.println("joinvo.getUsername() = " + joinvo.getUsername());
        System.out.println("joinvo.getEmail() = " + joinvo.getEmail());
        System.out.println("joinvo.getPassword() = " + joinvo.getPassword());
        joinvo.setId("test");
        joinservice.doInsert(joinvo);
    }
}
