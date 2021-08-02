package com.codingdojo.consultasyjoins.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.consultasyjoins.models.Language;

@Repository
public interface LanguageRepository extends CrudRepository<Language, Long> {
	@Query("SELECT c, l FROM Country c JOIN c.languages l WHERE l.percentage>89 ORDER BY l.percentage DESC")
	List<Object[]> findCountriesAndTheirLanguagesWherePercentageOver89OrderPercentageDesc();
}
