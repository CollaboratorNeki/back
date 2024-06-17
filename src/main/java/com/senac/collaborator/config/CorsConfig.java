package com.senac.collaborator.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class CorsConfig implements WebMvcConfigurer {
    
    @Value("${prop.cors.dev-url}")
    private String devUrl;
    
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOriginPatterns(devUrl)
                .allowedMethods("GET", "POST", "PUT", "DELETE", "PATCH")
                .allowedHeaders("*")
                .allowCredentials(true)
                .maxAge(3600);
    }
    
}