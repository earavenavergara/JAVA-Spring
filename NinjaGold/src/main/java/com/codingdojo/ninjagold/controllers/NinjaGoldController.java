package com.codingdojo.ninjagold.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NinjaGoldController {
	private int gold = 0;
	private String txt = "";
	
	SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	@RequestMapping("/gold")
	public String index(Model model) {
		model.addAttribute("gold", gold);
		model.addAttribute("txt", txt);
		return "index.jsp";
	}

	@RequestMapping("/farm")
	public String farm() {
		int rand = (int) (Math.random() * 11 + 10);// numero entre 10 y 20
		Date date = new Date();
		txt += "Entraste en una granja y ganaste "+rand+ " oro("+formatter.format(date)+")";
		setGold(getGold() + rand);
		return "redirect:/gold";
	}

	@RequestMapping("/cave")
	public String cave() {
		int rand = (int) (Math.random() * 6 + 5); // numero entre 5 y 10
		Date date = new Date();
		txt += "Entraste en una cueva y ganaste "+rand+ " oro("+formatter.format(date)+")";
		setGold(getGold() + rand);
		return "redirect:/gold";
	}

	@RequestMapping("/house")
	public String house() {
		int rand = (int) (Math.random() * 4 + 2); // numero entre 2 y 5
		Date date = new Date();
		txt += "Entraste en una casa y ganaste "+rand+ " oro("+formatter.format(date)+")";
		setGold(getGold() + rand);
		return "redirect:/gold";
	}

	@RequestMapping("/casino")
	public String casino() {
		int rand = (int) (Math.random() * 51);// numero entre 0 y 50
		Date date = new Date();
		txt += "Entraste en un casino y ganaste "+rand+ " oro("+formatter.format(date)+")";
		int signo = (int) (Math.random() * 2);
		if (signo == 1)
			setGold(getGold() + rand);
		else
			setGold(getGold() - rand);
		return "redirect:/gold";
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

}
