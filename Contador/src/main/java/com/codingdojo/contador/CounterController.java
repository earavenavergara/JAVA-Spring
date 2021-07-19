package com.codingdojo.contador;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {
	private static Integer count = 0;
	@RequestMapping("/")
	public String index(HttpSession session, Model model) {
		if (session.getAttribute("count") != null) {
			count = (Integer) session.getAttribute("count");
			
		}
		count++;
		session.setAttribute("count", count);
		model.addAttribute("count", count);
		return "index.jsp";
	}

	@RequestMapping("/counter")
	public String counter(Model model) {
		model.addAttribute("count", count);
		return "counter.jsp";
	}
}
