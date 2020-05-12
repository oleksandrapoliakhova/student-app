package com.studentapp.studentapp.model;

import javax.persistence.Entity;

/**
 * POJO for courses
 * db values: id, course, description
 */
@Entity
public class Course {

    private Long courseID;
    private String courseName;
    private String courseDescription;

}
