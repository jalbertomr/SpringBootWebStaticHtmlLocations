package com.bext.springbootwebstatic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Properties;

@SpringBootApplication
public class SpringbootwebstaticApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SpringbootwebstaticApplication.class);
        Properties props = new Properties();
        props.setProperty("spring.web.resources.static-locations", "classpath:/static_extra/,classpath:/static_extra2/");
        application.setDefaultProperties(props);
        application.run(args);
    }

}
