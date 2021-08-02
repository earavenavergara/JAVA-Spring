package com.codingdojo.listaestudiantes1.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.listaestudiantes1.models.Contact;
import com.codingdojo.listaestudiantes1.models.Student;
import com.codingdojo.listaestudiantes1.repisitories.ContactRepository;
import com.codingdojo.listaestudiantes1.repisitories.StudentRepository;

@Service
public class StudentsListService {
	private final StudentRepository stRepo;
	private final ContactRepository ctRepo;

	public StudentsListService(StudentRepository stRepo, ContactRepository ctRepo) {
		this.stRepo = stRepo;
		this.ctRepo = ctRepo;
	}

	public List<Student> allStudents() {
		return stRepo.findAll();
	}

	public void createStudent(Student s) {
		stRepo.save(s);
	}

	public void createContact(Contact c) {
		ctRepo.save(c);
	}
}
