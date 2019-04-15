package com.example.softwarePatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = HelloController.class)
public class SoftwarePatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoftwarePatternsApplication.class, args);
	}
	
	  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(SoftwarePatternsApplication.class);
	    }

}
