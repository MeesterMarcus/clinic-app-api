package com.mlorenzana.clinicappapi.services;


import com.mlorenzana.clinicappapi.entities.PatientEntity;
import com.mlorenzana.clinicappapi.repositories.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PatientService {

    final
    PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<PatientEntity> getPatients() {
        return this.patientRepository.findAll();
    }

    public void addPatient(PatientEntity entity) {
        this.patientRepository.save(entity);
    }

    public PatientEntity getPatientById(Long id) {
        return this.patientRepository.getById(id);
    }

    public void save(PatientEntity entity) {
        this.patientRepository.save(entity);
    }
}
