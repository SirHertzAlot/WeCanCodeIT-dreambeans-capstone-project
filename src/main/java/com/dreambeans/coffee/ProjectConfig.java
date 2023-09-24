package com.dreambeans.coffee;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration  
@ComponentScan(basePackages = "com.dream_beans.coffee")

@EnableJpaRepositories("com.dream_beans.coffee")
public class ProjectConfig {
    
}
