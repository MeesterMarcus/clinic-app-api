package com.mlorenzana.clinicappapi.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="patients")
@Data
public class PatientEntity {

    @Id
    @GeneratedValue(generator = "patient_generator")
    @SequenceGenerator(
            name = "patient_generator",
            sequenceName = "patient_sequence",
            initialValue = 1000
    )
    String id;

    @Column(columnDefinition = "first_name")
    String firstName;

    @Column(columnDefinition = "last_name")
    String lastName;

    @Column(columnDefinition = "address")
    String address;

    @Column(columnDefinition = "city")
    String city;

    @Column(columnDefinition = "state")
    String state;

    @Column(columnDefinition = "zip")
    String zip;

    @Column(columnDefinition = "email")
    String email;

    @Column(columnDefinition = "phone")
    String phone;

}
