package com.codingdojo.paginacionyclasificacion.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.paginacionyclasificacion.models.Ninja;

@Repository
public interface NinjasRepository extends PagingAndSortingRepository<Ninja, Long> {

}
