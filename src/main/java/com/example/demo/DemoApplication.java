package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Properties;

@SpringBootApplication
public class DemoApplication {
  @Bean
  WebMvcConfigurer configurer () {
    return new WebMvcConfigurerAdapter() {
      @Override
      public void addResourceHandlers (ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/newDir/newDir_1/**").addResourceLocations("classpath:/newDir/newDir_1/");
      }
    };
  }

  public static void main(String[] args) {
    new SpringApplicationBuilder()
        .sources(DemoApplication.class)
        .properties(new Properties() {{
          setProperty("spring.resources.staticLocations", "classpath:/public/");
        }})
        .build()
        .run(args);
  }
}
