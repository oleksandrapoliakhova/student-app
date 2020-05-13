package com.studentapp.studentapp.services;

import com.studentapp.studentapp.model.Instructor;

import java.util.List;

public interface InstructorService extends CrudService<Instructor, Long> {

    Instructor findByLastName (String lastName);

    List<Instructor> findAllByLastNameLike(String lastName);

}
