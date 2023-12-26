package kr.co.chunjae.controller;

import lombok.extern.log4j.Log4j;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j
public class CommonController {

    @GetMapping(value = "/accessError")
    public void accessDenied(Authentication auth, Model model) {
        log.error("access denied, print Authentication object: " + auth);
        model.addAttribute("msg", "Access Denied");
    }

    @GetMapping(value = "/customLogin")
    public void loginInput(String error, String logout, Model model) {
        log.info("error: " + error);
        log.info("logout: " + logout);

        if (StringUtils.hasText(error)) {
            model.addAttribute("error", "Login Error. Check Your Account!");
        }

        if (StringUtils.hasText(logout)) {
            model.addAttribute("logout", "Logout!");
        }
    }
}
