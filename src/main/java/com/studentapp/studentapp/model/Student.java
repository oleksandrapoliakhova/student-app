package com.studentapp.studentapp.model;

import javax.persistence.Entity;
import java.util.Date;

/**
 * Student POJO
 * db values: id, first_name, last_name, gender, email, address,
 * state, postal_code, phone_number, matriculation_date, notes
 */

@Entity
public class Student {

    private Long studentID;
    private String studentFirstName;
    private String studentLastName;
    private String studentGender;
    private String studentEmail;
    private String studentAddress;
    private String studentState;
    private Long studentPostalCode;
    private Long studentPhoneNumber;
    private Date studentMatrDate;
    private String studentNotes;

}
