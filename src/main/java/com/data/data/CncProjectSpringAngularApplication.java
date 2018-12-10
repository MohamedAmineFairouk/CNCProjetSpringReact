package com.data.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class CncProjectSpringAngularApplication {

	public static void main(String[] args) {
		SpringApplication.run(CncProjectSpringAngularApplication.class, args);
	}
	
	@RequestMapping("/serverTest")
	 String test() {
		return("server is OK!!");
	}
}
