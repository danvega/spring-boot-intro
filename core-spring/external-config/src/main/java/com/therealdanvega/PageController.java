package com.therealdanvega;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {

    @Value("${pageController.msg}")
    private String pageControllerMsg;

    @Value("${my.secret}")
    private String mySecret;

    @RequestMapping("/")
    public String home(){
        return mySecret;
    }

}
