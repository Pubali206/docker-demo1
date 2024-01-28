package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerDemoApplication {

	@GetMapping("/message")
	public String getMessage() {
		return "test1234";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerDemoApplication.class, args);
	}

}
