package com.studentapp.studentapp.repo;

import com.studentapp.studentapp.model.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepo extends CrudRepository<Student, Long> {

    Student findAllByLastName (String lastName);

    List<Student>  findAllByLastNameLike (String lastName);
}
