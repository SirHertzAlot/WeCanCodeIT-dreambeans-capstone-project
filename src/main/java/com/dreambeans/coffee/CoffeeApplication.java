package com.dreambeans.coffee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication 
@ComponentScan(basePackages ={"com.dreambeans.coffee", "com.dreambeans.coffee.*"})
@EntityScan({"com.dreambeans.coffee", "com.dreambeans.coffee.*"})
// @EnableJpaRepositories({"com.dreambeans.coffee", "com.dreambeans.coffee.*"})
public class CoffeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoffeeApplication.class, args);
		
	}


}
