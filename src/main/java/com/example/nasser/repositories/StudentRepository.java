package com.example.nasser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.nasser.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
