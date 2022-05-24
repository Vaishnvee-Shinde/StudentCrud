package com.example.StudentCrud.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.StudentCrud.repository.StudentRepository;
import com.example.StudentCrud.domain.Student;


@Service
public class StudentService {

	public StudentService() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Autowired
    private StudentRepository repo;
	
	public List<Student> listAll() {
        return repo.findAll();
    }
     
    public void save(Student std) {
        repo.save(std);
    }
     
    public Student get(long id) {
        return repo.findById(id).get();
    }
     
    public void delete(long id) {
        repo.deleteById(id);
    }
}
