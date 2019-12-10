package com.mlorenzana.clinicappapi.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Entity
@Data
@Table(name = "appointments")
public class AppointmentEntity {

    @Id
    @GeneratedValue(generator = "patient_generator")
    @SequenceGenerator(
            name = "patient_generator",
            sequenceName = "patient_sequence",
            initialValue = 1000
    )
    Long id;

    @Column(name="appt_datetime")
    ZonedDateTime dateTime;

    @Column(name="notes")
    String notes;

    @Column(name="appt_type")
    String apptType;

    @Column(name="complete")
    String complete;

    @ManyToOne
    @JoinColumn(name="patient_id", referencedColumnName = "id")
    PatientEntity patientEntity;

}
