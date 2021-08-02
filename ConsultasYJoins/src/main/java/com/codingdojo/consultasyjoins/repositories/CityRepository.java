package com.codingdojo.consultasyjoins.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.consultasyjoins.models.City;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {
	@Query("SELECT ci.name, ci.population FROM Country co JOIN co.cities ci WHERE ci.population>500000 AND co.name='mexico' ORDER BY ci.population DESC")
	List<Object[]> findCitiesAndItsPopulationOrderDesc();

}
