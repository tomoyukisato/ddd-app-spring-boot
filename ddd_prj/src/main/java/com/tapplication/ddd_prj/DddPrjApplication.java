package com.tapplication.ddd_prj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; // 追加
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DddPrjApplication {

	public static void main(String[] args) {
		SpringApplication.run(DddPrjApplication.class, args);
	}

	@RequestMapping("/")  // 追加
	public String home() { // 追加
		return "Hello World"; // 追加
	}
}
