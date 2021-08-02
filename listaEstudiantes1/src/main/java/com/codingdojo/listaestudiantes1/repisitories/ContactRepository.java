package com.codingdojo.listaestudiantes1.repisitories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.listaestudiantes1.models.Contact;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {
}
