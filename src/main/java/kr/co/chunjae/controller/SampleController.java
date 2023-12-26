package kr.co.chunjae.controller;

import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Log4j
@Controller
@RequestMapping(value = "/sample")
public class SampleController {

    @GetMapping(value = "/all")
    public void doAll() {
        log.info("doo all can access everybody");
    }

    @GetMapping(value = "/member")
    public void doMember() {
        log.info("doMember()");
    }

    @GetMapping(value = "/admin")
    public void doAdmin() {
        log.info("doAdmin()");
    }
}
