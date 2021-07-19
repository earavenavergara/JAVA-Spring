package com.codingdojo.firstproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")
public class CodingController {
	@RequestMapping("")
    public String msje1(){
      return "¡Hola Coding Dojo!";
    }
	@RequestMapping("/python")
    public String msje2(){
      return "¡Python/Django fue increíble!";
    }
    @RequestMapping("/java")
    public String msje3(){
      return "¡Java/Spring es mejor!";
    }
}
