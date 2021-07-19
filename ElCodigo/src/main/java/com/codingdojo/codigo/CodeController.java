package com.codingdojo.codigo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CodeController {
	@RequestMapping(value = "/code", method = RequestMethod.POST)
	public String Code(@RequestParam(value = "code") String code) {
		if (code.equals("bushido"))
			return "code.jsp";
		return "redirect:/createError";
	}
}
