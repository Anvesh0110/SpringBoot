package com.example.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/")
public class HomeController {
	
	@GetMapping("home")
	//@RequestMapping(value="home",method=RequestMethod.GET)
	public String greet()
	{
		return "Hi From Spring boot!!";
	}
}
