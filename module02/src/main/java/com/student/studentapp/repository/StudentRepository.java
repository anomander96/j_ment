package com.student.studentapp.repository;

import org.springframework.data.repository.CrudRepository;
import com.student.studentapp.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{
}
