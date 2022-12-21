package com.example.nasser.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nasser.entities.Student;
import com.example.nasser.repositories.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository studentRepository;
	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}
	public List<Student> getAllStudents(){
		List<Student> students =  studentRepository.findAll();
		return students;
	}
	public void deleteStudent(Long id) {
		studentRepository.deleteById(id);
	}

}
