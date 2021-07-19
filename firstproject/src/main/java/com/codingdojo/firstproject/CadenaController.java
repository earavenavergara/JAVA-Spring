package com.codingdojo.firstproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cadena")
public class CadenaController {
	@RequestMapping("")
	public String msje1() {
		return "Hello client! How are you doing?";
	}

	@RequestMapping("/random")
	public String msje2() {
		return "Spring Boot is great! So easy to just repond with string";
	}
}
