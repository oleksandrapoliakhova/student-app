package com.studentapp.studentapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.util.Set;

/**
 * Student POJO
 * db values: id, first_name, last_name, gender, email, address,
 * state, postal_code, phone_number, matriculation_date, notes
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "STUDENT")
public class Student extends Person {

    Set<Course> studentCources;

    @Column(name = "matriculation_date")
    private Date studentMatrDate;

    @Column(name = "notes")
    private String studentNotes;

}
