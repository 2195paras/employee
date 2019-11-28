package com.employee.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages="com.employee.portal.repository")
public class PortalApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(PortalApplication.class, args);
	}

}
