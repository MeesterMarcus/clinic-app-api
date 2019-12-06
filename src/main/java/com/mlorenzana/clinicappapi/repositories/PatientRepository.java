package com.mlorenzana.clinicappapi.repositories;

import com.mlorenzana.clinicappapi.entities.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<PatientEntity, Long> {

    public PatientEntity getById(Long id);
}
