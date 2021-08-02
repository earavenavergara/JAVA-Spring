package com.codingdojo.paginacionyclasificacion.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.paginacionyclasificacion.models.Dojo;

@Repository
public interface DojosRepository extends CrudRepository<Dojo, Long> {
	List<Dojo> findAll();

	Dojo findByName(String name);
}
