package com.akash.todoapplication.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SprinBootApplication initialises the Spring(Component Scan) ans Spring Boot(Auto Configuration)
@SpringBootApplication
public class TodoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

}
