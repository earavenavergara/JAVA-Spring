package com.codingdojo.shows.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.shows.models.Show;

@Repository
public interface ShowRepository extends CrudRepository<Show, Long> {
	Iterable<Show> findAllByOrderByAvgDesc();
}
