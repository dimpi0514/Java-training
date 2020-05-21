package com.example.HelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAutoConfiguration
@RestController
public class HelloWorldApplication {
	
	@RequestMapping("/")
	
	public String home() {
		return "Hello World!!";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

}
