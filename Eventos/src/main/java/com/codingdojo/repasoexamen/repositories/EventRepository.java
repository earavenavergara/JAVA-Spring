package com.codingdojo.repasoexamen.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.repasoexamen.models.Event;

@Repository
public interface EventRepository extends CrudRepository<Event, Long> {

}
