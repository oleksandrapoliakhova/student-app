package com.studentapp.studentapp.repo;

import com.studentapp.studentapp.model.Instructor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface InstructorRepo extends CrudRepository<Instructor, Long> {

    Instructor findAllByLastName (String lastName);

    List<Instructor>  findAllByLastNameLike (String lastName);

}
