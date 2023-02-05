package com.greatlearning.studentmngmnt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.studentmngmnt.entity.Student;



public interface StudentRepository extends JpaRepository<Student, Integer> {
}
