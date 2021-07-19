package com.codingdojo.firstproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/homejsp")
public class HomeJspController {
	@RequestMapping("/")
    public String index() {
        return "index.jsp";
    }
}
