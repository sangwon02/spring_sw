package com.sangwon.sangwoncampus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SangwonCampusApplication {

	public static void main(String[] args) {
		SpringApplication.run(SangwonCampusApplication.class, args);
	}
	@GetMapping
	public String index(){
		return "hello, spring boot";
	}
}
