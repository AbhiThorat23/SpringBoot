package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/")
	public String helloWorld(){
		System.out.println("inside hello world");
		System.out.println("testing checkin for git");
		return "hello world!!";
	}
}
