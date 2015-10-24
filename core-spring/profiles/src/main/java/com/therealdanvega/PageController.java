package com.therealdanvega;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {

    @Value("${spring.profiles.active}")
    private String environment;

    @Value("${msg}")
    private String msg;

    @RequestMapping("/")
    public String home(){
        return msg;
    }

}
