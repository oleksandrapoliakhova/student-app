package com.studentapp.studentapp.services.mapping;


import com.studentapp.studentapp.model.Course;
import com.studentapp.studentapp.model.Instructor;
import com.studentapp.studentapp.services.CrudService;

import java.util.Set;

public class CourseMapServiceMapImpl extends AbstractMapService<Course, Long> implements CrudService<Course, Long> {

    @Override
    public Set<Course> findAll() {

        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {

        super.deleteById(id);

    }

    @Override
    public Course save(Course course) {

        super.save(course.getId(), course);
        return course;
    }

    @Override
    public void delete(Course course) {

        super.delete(course);

    }

    @Override
    public Course findById(Long id) {

        return super.findById(id);
    }
}
