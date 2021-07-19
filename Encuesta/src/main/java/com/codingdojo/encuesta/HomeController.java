package com.codingdojo.encuesta;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}

	@RequestMapping("/result")
	public String result(Model model, @RequestParam(value = "name") String name,
			@RequestParam(value = "location") String location, @RequestParam(value = "language") String language,
			@RequestParam(value = "comment", required = false) String comment) {
		model.addAttribute("name", name);
		model.addAttribute("location", location);
		model.addAttribute("language", language);
		if (comment != null)
			model.addAttribute("comment", comment);
		return "result.jsp";
	}
}
