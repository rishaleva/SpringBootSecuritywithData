package ru.rishaleva.springBootSecurity.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("/hello");
        registry.addViewController("/user").setViewName("/user");
        registry.addViewController("/admin").setViewName("/users");
    }
}
