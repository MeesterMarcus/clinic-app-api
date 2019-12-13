package com.mlorenzana.clinicappapi.repositories;

import com.mlorenzana.clinicappapi.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {

    Patient getById(Long id);
}
