package com.therealdanvega;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
//@EnableConfigurationProperties
public class ConfigpropsApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(ConfigpropsApplication.class, args);

        MyAppConfig config = (MyAppConfig) ctx.getBean("myAppConfig");
        System.out.println(config.toString());
    }

}
