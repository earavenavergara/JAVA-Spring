package com.codingdojo.consultasyjoins.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.consultasyjoins.models.Country;

@Repository
public interface CountryRepository extends CrudRepository<Country, Long> {
	@Query("SELECT c, l FROM Country c JOIN c.languages l WHERE l.language='slovene' ORDER BY l.percentage DESC")
	List<Object[]> findCountriesWhereLanguageSlovene();

	@Query("SELECT co.name, COUNT(ci.id) FROM Country co JOIN co.cities ci GROUP BY co ORDER BY count(ci.id) DESC")
	List<String[]> findCountriesCitiesCount();

	@Query("SELECT c.name, c.surfaceArea, c.population FROM Country c WHERE c.surfaceArea<501 AND c.population>100000")
	List<String[]> findCountriesWithSurfaceAreaLessThan501AndPopulationOver100000();

	@Query("SELECT c.name FROM Country c WHERE c.governmentForm='Constitutional Monarchy' AND c.surfaceArea>200 AND c.lifeExpectancy>75")
	List<String> findCountrieMonarchySurfaceAreaOver200LifeExpectOver75();

	@Query("SELECT co.name, ci.name, ci.district, ci.population FROM Country co JOIN co.cities ci WHERE co.name='Argentina' AND ci.population>500000 AND ci.district='Buenos Aires'")
	List<String[]> findArgentinaCitiesWherePopulationOver500000AndDistrictBuenosAires();

	@Query("SELECT co.region, COUNT(co.id) FROM Country co GROUP BY co.region ORDER BY COUNT(co.id) DESC")
	List<Object[]> findRegionCountriesCount();
}
