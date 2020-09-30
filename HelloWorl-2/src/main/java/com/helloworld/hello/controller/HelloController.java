package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/obj")
public class HelloController {
	
	@GetMapping 
	public String objetivos () {
		return ("O meu objetivo para essa semana é aprimorar o aprendizado sobre MySQL e acrescentar STS. ");
	}

}
