package com.example.sample1app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;


//import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
@RestController
public class SampleBootApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(SampleBootApp1Application.class, args);
	}
	
	@RequestMapping("/{num}")
	public String index(@PathVariable("num") int num) {
	    if (num == 1) {
	        return "Hello, ONE!";
	    }
	    return "Hello, Spring Boot 3!!";
	}

	/*
	//「/」にアクセスしたらindexクラスが呼ばれる
	@RequestMapping("/{num}")
	public String index(@PathVariable int num) {
		if (num == 1)
			return ("Hello,ONE!");
		return ("Hello, Spring Boot 3!!");
	}
	*/
}