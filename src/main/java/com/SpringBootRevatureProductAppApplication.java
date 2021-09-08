package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRevatureProductAppApplication {

	public static void main(String[] args) {

		SpringApplication application=new SpringApplication(SpringBootRevatureProductAppApplication.class);
		//application.setAdditionalProfiles("prod");
		application.run(args);	
	}

}
