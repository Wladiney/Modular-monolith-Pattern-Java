package com.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages= {"com.ModuleA", "com.ModuleB"})
public class SwaggerSpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerSpringDemoApplication.class, args);
	}
}