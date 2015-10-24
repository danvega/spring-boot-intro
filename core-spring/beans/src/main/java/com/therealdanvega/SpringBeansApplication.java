package com.therealdanvega;

import com.abc.foo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@ComponentScan({"com.therealdanvega","com.abc.foo"})
@SpringBootApplication
public class SpringBeansApplication {

    @Bean
    public User user(){
        return new User("Dan","Vega");
    }

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringBeansApplication.class, args);

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for( String name : beanNames ){
            System.out.println(name);
        }

        System.out.println( ctx.getBean("user").toString() );

    }
}
