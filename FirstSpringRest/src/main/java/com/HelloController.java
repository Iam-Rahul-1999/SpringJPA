package com;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("hello")
	public String hello()
	{
		System.out.println("Welcome to Spring Rest");
		return "Welcome to Spring Rest";
	}

}
