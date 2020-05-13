package com.studentapp.studentapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * POJO for courses
 * db values: id, course, description
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "COURSE")
public class Course extends BaseEntity {

    @Column(name = "course")
    private String courseName;

    @Column(name = "description")
    private String courseDescription;

}
