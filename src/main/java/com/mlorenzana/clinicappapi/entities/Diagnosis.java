package com.mlorenzana.clinicappapi.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Entity
@Data
@Table(name="diagnosis")
public class Diagnosis {

    @Id
    @GeneratedValue(generator = "patient_generator")
    @SequenceGenerator(
            name = "patient_generator",
            sequenceName = "patient_sequence",
            initialValue = 1000
    )
    Long id;

    @Column(name="name")
    String name;

    @Column(name="description")
    String description;

    @Column(name="severity")
    String severity;

    @Column(name="date_diagnosed")
    ZonedDateTime dateDiagnosed;

    @ManyToOne
    @JoinColumn(name="patientId", referencedColumnName = "id")
    Patient patient;
}
