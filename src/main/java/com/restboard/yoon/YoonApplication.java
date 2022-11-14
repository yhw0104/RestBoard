package com.restboard.yoon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class YoonApplication {

	public static void main(String[] args) {
		SpringApplication.run(YoonApplication.class, args);
	}

}
