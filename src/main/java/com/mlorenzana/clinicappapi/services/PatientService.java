package com.mlorenzana.clinicappapi.services;


import com.mlorenzana.clinicappapi.entities.Patient;
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

    public List<Patient> getPatients() {
        return this.patientRepository.findAll();
    }

    public void addPatient(Patient entity) {
        this.patientRepository.save(entity);
    }

    public Patient getPatientById(Long id) {
        return this.patientRepository.getById(id);
    }

    public void save(Patient entity) {
        this.patientRepository.save(entity);
    }
}
