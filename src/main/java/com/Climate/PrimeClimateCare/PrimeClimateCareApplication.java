package com.Climate.PrimeClimateCare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class PrimeClimateCareApplication {

	public static void main(String[] args) {

		SpringApplication.run(PrimeClimateCareApplication.class, args);
	}
}
