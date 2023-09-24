package com.dreambeans.coffee;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
// @ComponentScan(basePackages = "com.dream_beans.coffee")
// @EntityScan("com.dream_beans.coffee")
// @EnableJpaRepositories("com.dream_beans.coffee")
public class CoffeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoffeeApplication.class, args);

	}


}
