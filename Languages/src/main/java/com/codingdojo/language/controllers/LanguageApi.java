package com.codingdojo.language.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codingdojo.language.models.Language;
import com.codingdojo.language.services.LanguageService;

@RestController
public class LanguageApi {

	private final LanguageService languageService;

	public LanguageApi(LanguageService languageService) {
		this.languageService = languageService;
	}

	@RequestMapping("/api/lang")
	public List<Language> index() {
		return languageService.allLanguages();
	}

	@RequestMapping(value = "/api/lang", method = RequestMethod.POST)
	public Language create(@RequestParam(value = "name") String name, @RequestParam(value = "creator") String creator,
			@RequestParam(value = "currentVersion") String currentVersion) {
		Language language = new Language(name, creator, currentVersion);
		return languageService.createLanguage(language);
	}

}
