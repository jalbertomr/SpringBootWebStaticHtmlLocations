package com.bext.springbootwebstatic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Properties;

@SpringBootApplication
public class SpringbootwebstaticApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SpringbootwebstaticApplication.class);
        //Properties props = new Properties();
        //props.setProperty("spring.web.resources.static-locations", "classpath:/static_extra/,classpath:/static_extra2/");
        //application.setDefaultProperties(props);
        application.run(args);
    }

    @Bean
    WebMvcConfigurer webMvcConfigurer(){
        return new WebMvcConfigurer() {
            @Override
            public void addResourceHandlers(ResourceHandlerRegistry registry) {
                registry.addResourceHandler("/static_extra/**", "/static_extra2/**")
                        .addResourceLocations("classpath:/static_extra/", "classpath:/static_extra2/");
                //to call localhost:8080/static_extra/static_extra.html and
                //        localhost:8080/static_extra2/static_extra2.html
            }
        };
    }
}
