package com.studentapp.studentapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class Person extends BaseEntity{

    public Person(Long id, String firstName, String lastName, String gender, String email, String address, String state, Long postalCode, Long phoneNumber) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.address = address;
        this.state = state;
        this.postalCode = postalCode;
        this.phoneNumber = phoneNumber;
    }

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "gender")
    private String gender;

    @Column(name = "email")
    private String email;

    @Column(name = "address")
    private String address;

    @Column(name = "state")
    private String state;

    @Column(name = "postal_code")
    private Long postalCode;

    @Column(name = "phone_number")
    private Long phoneNumber;
}
