package uniongraphix.springsc.study;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseCookie;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@Slf4j
@RestController
public class ScController {

    @GetMapping("/getuser")
    public String hello(@AuthenticationPrincipal User user, HttpSession httpSession){
//        return new ResponseCookieDto()

        String userName = "없음";
        String session_id = "없음";
        String pass = "없음";
        if(user == null){
            log.info("유저 없습니다.");
        }else{
            session_id = httpSession.getId();
            userName = user.getUsername();
            pass = user.getPassword();
            log.info("session_id : {}", session_id);
            log.info("userName : {}", userName);
            log.info("userName : {}", pass);
        }


        return null;

    }
}
