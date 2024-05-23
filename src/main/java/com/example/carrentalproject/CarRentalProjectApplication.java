package com.example.carrentalproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.example.carrentalproject")
@SpringBootApplication
public class CarRentalProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarRentalProjectApplication.class, args);
	}

}
