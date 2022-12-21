package com.example.nasser.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.nasser.entities.Student;
import com.example.nasser.services.StudentService;

import jakarta.websocket.server.PathParam;

@RestController
public class StudentController {
	@Autowired
	StudentService studentService;

	@GetMapping("/")
	public String hello() {
		return "hello Yanis";
	}

	@PostMapping("/add_student")
	public Student addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}
	@GetMapping("/get_students")
	public List<Student> getStudents(){
		return studentService.getAllStudents();
	}
	@DeleteMapping("/delete/{id}")
	public void deleteStudentById(@PathVariable Long id) {
		studentService.deleteStudent(id);
	}

}
