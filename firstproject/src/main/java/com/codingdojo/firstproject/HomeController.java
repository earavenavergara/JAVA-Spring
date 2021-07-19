package com.codingdojo.firstproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class HomeController {
    @RequestMapping("")
    public String index(){
      return "Esto es accedido con la ruta http://your_server/simple/root";
    }
    @RequestMapping("/hello")
    public String hello(){
      return "Hello world! ¿Que ruta utilizaste para acceder aqui?";
    }
    @RequestMapping("/goodbye")
    public String world(){
      return "Goodbye world!";
    }
}
