package com.kahihi.aggay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
//@EnableWebMvc
@ComponentScan(basePackages = { "Controller", "Configuration" })
public class CustomerSupportApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerSupportApplication.class, args);
	}
}
