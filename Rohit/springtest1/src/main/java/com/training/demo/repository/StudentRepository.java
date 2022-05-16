package com.training.demo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.demo.entities.Student;


@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{
	@Query(value = "SELECT * from student where student_id=?",nativeQuery = true)
	Student findByStudentId(Integer studentId);
	

}
