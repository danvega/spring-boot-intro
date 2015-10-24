package com.therealdanvega;

import com.abc.foo.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {

    // notificationService
    private NotificationService notificationService;

    @Autowired
    public PageController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @RequestMapping("/")
    public String home(){
        return notificationService.toString();
    }

}
