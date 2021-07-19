package com.codingdojo.firstproject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("/{palabra}")
	public String msje1(@PathVariable("palabra") String palabra) {
		if (palabra.equals("dojo")) {
			return "¡El Dojo es increíble!";
		} else if (palabra.equals("burbank-dojo")) {
			return "El Dojo Burbank está localizado al sur de California";
		} else if (palabra.equals("san-jose")) {
			return "El Dojo SJ es el cuartel general";
		}
		return null;
	}
}
