package com.therealdanvega;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class DataSourceConfig {

    @Bean(name = "datasource")
    @Profile("development")
    DataSource development(){
        return new DataSource("my-development-url",9999);
    }

    @Bean(name = "datasource")
    @Profile("production")
    DataSource production(){
        return new DataSource("my-production-url",9999);
    }

}
