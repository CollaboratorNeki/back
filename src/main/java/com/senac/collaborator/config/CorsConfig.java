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
<<<<<<< HEAD
                .allowedOriginPatterns(devUrl, "http://localhost:5173")
=======
                .allowedOriginPatterns(devUrl,"http://localhost:5173/")
>>>>>>> 27f8d381b72cc01fb320e5fa8b51cfb2ec86aaf2
                .allowedMethods("GET", "POST", "PUT", "DELETE", "PATCH")
                .allowedHeaders("*")
        
                .maxAge(3600);
    }
    
}