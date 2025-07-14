package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	System.out.println("i created java program");

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
