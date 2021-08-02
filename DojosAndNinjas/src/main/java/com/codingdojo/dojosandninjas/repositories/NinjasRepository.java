package com.codingdojo.dojosandninjas.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.dojosandninjas.models.Ninja;

@Repository
public interface NinjasRepository extends CrudRepository<Ninja, Long> {

}
