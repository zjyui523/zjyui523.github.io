package com.java1234.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping("/helloWorld")
	public String say(){
		return "spring boot 你大爷sssssssssssss";
	}
}
