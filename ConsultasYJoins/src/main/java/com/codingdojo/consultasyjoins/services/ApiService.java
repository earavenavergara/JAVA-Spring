package com.codingdojo.consultasyjoins.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.consultasyjoins.repositories.CityRepository;
import com.codingdojo.consultasyjoins.repositories.CountryRepository;
import com.codingdojo.consultasyjoins.repositories.LanguageRepository;

@Service
public class ApiService {
	private final CountryRepository coRepo;
	private final CityRepository ciRepo;
	private final LanguageRepository lRepo;

	public ApiService(CountryRepository coRepo, CityRepository ciRepo, LanguageRepository lRepo) {
		this.coRepo = coRepo;
		this.ciRepo = ciRepo;
		this.lRepo = lRepo;
	}

	public List<Object[]> findCountriesWhereLanguageSloveneOrderByPercentageDesc() {
		return coRepo.findCountriesWhereLanguageSlovene();
	}

	public List<String[]> findCountriesCitiesCount() {
		return coRepo.findCountriesCitiesCount();
	}

	public List<Object[]> findCitiesAndItsPopulationOrderDesc() {
		return ciRepo.findCitiesAndItsPopulationOrderDesc();
	}

	public List<Object[]> findCountriesAndTheirLanguagesWherePercentageOver89OrderPercentageDesc() {
		return lRepo.findCountriesAndTheirLanguagesWherePercentageOver89OrderPercentageDesc();
	}

	public List<String[]> findCountriesWithSurfaceAreaLessThan501AndPopulationOver100000() {
		return coRepo.findCountriesWithSurfaceAreaLessThan501AndPopulationOver100000();
	}

	public List<String> findCountrieMonarchySurfaceAreaOver200LifeExpectOver75() {
		return coRepo.findCountrieMonarchySurfaceAreaOver200LifeExpectOver75();
	}

	public List<String[]> findArgentinaCitiesWherePopulationOver500000AndDistrictBuenosAires() {
		return coRepo.findArgentinaCitiesWherePopulationOver500000AndDistrictBuenosAires();
	}

	public List<Object[]> findRegionCountriesCount() {
		return coRepo.findRegionCountriesCount();
	}
}