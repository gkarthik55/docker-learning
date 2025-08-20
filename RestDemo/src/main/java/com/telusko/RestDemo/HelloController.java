package com.telusko.RestDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController
{
	@GetMapping("/home")
	public String getMessage()
	{
		return "Welcome to Telusko Learnings..";
	}
}
