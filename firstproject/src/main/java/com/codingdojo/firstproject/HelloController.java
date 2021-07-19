package com.codingdojo.firstproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/")
	public String msje(@RequestParam(value = "name", required = false) String name) {
		if (name == null) {
			return "Hola Humano";
		}
		return "Hola " + name;

	}
}