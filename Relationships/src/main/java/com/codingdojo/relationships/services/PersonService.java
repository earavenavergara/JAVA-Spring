package com.codingdojo.relationships.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.relationships.models.Person;
import com.codingdojo.relationships.repositories.PersonRepository;

@Service
public class PersonService {
	private final PersonRepository personRepository;

	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	public void createPerson(Person p) {
		personRepository.save(p);
	}

	public List<Person> allPersons() {
		List<Person> optListPerson = personRepository.findAll();
		return optListPerson;
	}

	public Person findPersonById(Long id) {
		Optional<Person> optPerson = personRepository.findById(id);
		if (optPerson.isPresent()) {
			return optPerson.get();
		} else {
			return null;
		}
	}

}
