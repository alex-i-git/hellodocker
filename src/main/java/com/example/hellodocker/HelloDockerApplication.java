package com.example.hellodocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloDockerApplication.class, args);
	}

	@GetMapping("/")
	public String helloDocker() {
		return "Hello Docker!";
	}
}
