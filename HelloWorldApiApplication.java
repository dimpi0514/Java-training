package com.example.HelloWorldAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAutoConfiguration
@RestController
public class HelloWorldApiApplication {
	
	@GetMapping("/hello")
	public String print() {
		return "Hello This is from Application!!";
	}
	
	@GetMapping("/")
	public String hi() {
		return "Hello World!!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApiApplication.class, args);
	}

}