package com.codingdojo.mostrarfecha;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}

	@RequestMapping("/date")
	public String date(Model model) {
		Date date = new Date();
		SimpleDateFormat formateadorFecha = new SimpleDateFormat("EEEE, d MMMM yyyy");
		model.addAttribute("fecha", formateadorFecha.format(date));
		return "date.jsp";
	}

	@RequestMapping("/time")
	public String time(Model model) {
		Date date = new Date();
		SimpleDateFormat formateadorHora = new SimpleDateFormat("h:mm a");
		model.addAttribute("hora", formateadorHora.format(date));
		return "time.jsp";
	}
}