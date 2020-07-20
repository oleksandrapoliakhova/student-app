package com.studentapp.studentapp.services.mapping;

import com.studentapp.studentapp.model.Instructor;
import com.studentapp.studentapp.services.CrudService;

import java.util.Set;

public class InstructorServiceMapImpl extends AbstractMapService<Instructor, Long> implements CrudService<Instructor, Long> {


    @Override
    public Set<Instructor> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public void delete(Instructor instructor) {
        super.delete(instructor);

    }

    @Override
    public Instructor save(Instructor instructor) {
        super.save(instructor.getId(), instructor);

        return instructor;
    }

    @Override
    public Instructor findById(Long id) {
        return super.findById(id);
    }
}
