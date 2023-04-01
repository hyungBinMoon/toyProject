package toyProject.webService.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import toyProject.webService.join.UserVO;
import toyProject.webService.main.userJPA.jpaService;

@Controller
public class loginController {
    @Autowired
    jpaService jpaService;

    @RequestMapping("/login")
    public String login(UserVO loginVO, Model model){
        System.out.println("### Username from html => "+loginVO.getUsername());
        System.out.println("### UserPasswod from html => "+loginVO.getPassword());

        //JPA 이용, 등록된 사용자인지 확인.
        UserVO loginUser = jpaService.searchUser(loginVO);

        System.out.println("### Username in database => "+loginUser.getUsername());
        System.out.println("### UserPasswod in database => "+ loginUser.getPassword());

        if(loginUser.getUsername() == null || loginUser.getId() == null){
            model.addAttribute("alert", "noUser");
            return "mainPage";
        }else{
            model.addAttribute("alert","User");
            model.addAttribute("username", loginUser.username);
            return "mainPage";
        }
    }
}
