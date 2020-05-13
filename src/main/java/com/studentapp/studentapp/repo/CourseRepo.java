package com.studentapp.studentapp.repo;

import com.studentapp.studentapp.model.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepo extends CrudRepository<Course, Long> {

}
