package com.studentapp.studentapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Instructor POJO
 * db values: id, first_name, last_name, gender, education, email,
 * address, state, postal_code, phone_number
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "INSTRUCTOR")
public class Instructor extends Person {

    @Column(name = "education")
    private String instructorEducation;

}
