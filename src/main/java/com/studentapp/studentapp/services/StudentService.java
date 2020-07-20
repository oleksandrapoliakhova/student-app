package com.studentapp.studentapp.services;

import com.studentapp.studentapp.model.Instructor;
import com.studentapp.studentapp.model.Student;

import java.util.List;

public interface StudentService extends CrudService<Student, Long>  {

    Student findByLastName (String lastName);

    List<Student> findAllByLastNameLike(String lastName);

}
