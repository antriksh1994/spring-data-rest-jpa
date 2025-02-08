package com.demo.springboot.cruddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CruddemoApplication {
	public static void main(String[] args) {
		System.out.println("==9==In main app");
		SpringApplication.run(CruddemoApplication.class, args);
	}

}
