package com.studentapp.studentapp.services.mapping;

import com.studentapp.studentapp.model.Student;
import com.studentapp.studentapp.services.CrudService;

import java.util.Set;

public class StudentMapServiceMapImpl extends AbstractMapService<Student, Long> implements CrudService<Student, Long> {


    @Override
    public Set<Student> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {

        super.deleteById(id);
    }

    @Override
    public void delete(Student student) {

        super.delete(student);
    }

    @Override
    public Student save(Student student) {

        super.save(student.getId(), student);
        return student;
    }

    @Override
    public Student findById(Long id) {

        return super.findById(id);
    }
}
