package com.codingdojo.consultasyjoins.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.consultasyjoins.services.ApiService;

@Controller
public class ApiController {
	private final ApiService s;

	public ApiController(ApiService s) {
		this.s = s;
	}

	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("uncountries", s.findCountriesWhereLanguageSloveneOrderByPercentageDesc());
		model.addAttribute("doscountries", s.findCountriesCitiesCount());
		model.addAttribute("trescountries", s.findCitiesAndItsPopulationOrderDesc());
		model.addAttribute("cuatrocountries",
				s.findCountriesAndTheirLanguagesWherePercentageOver89OrderPercentageDesc());
		model.addAttribute("cincocountries", s.findCountriesWithSurfaceAreaLessThan501AndPopulationOver100000());
		model.addAttribute("seiscountries", s.findCountrieMonarchySurfaceAreaOver200LifeExpectOver75());
		model.addAttribute("sietecountries", s.findArgentinaCitiesWherePopulationOver500000AndDistrictBuenosAires());
		model.addAttribute("ochocountries", s.findRegionCountriesCount());
		return "index.jsp";
	}

}
