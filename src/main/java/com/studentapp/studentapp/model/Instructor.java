package com.studentapp.studentapp.model;

import javax.persistence.Entity;

/**
 * Instructor POJO
 * db values: id, first_name, last_name, gender, education, email, address, state, postal_code, phone_number
 */

@Entity
public class Instructor {

    private Long instructorID;
    private String instructorFirstName;
    private String instructorLastName;
    private String instructorGender;
    private String instructorEducation;
    private String instructorEmail;
    private String instructorAddress;
    private String instructorState;
    private Long instructorPostalCode;
    private Long studentPhoneNumber;

}
