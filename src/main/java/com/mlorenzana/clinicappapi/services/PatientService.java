package com.mlorenzana.clinicappapi.services;


import com.mlorenzana.clinicappapi.entities.PatientEntity;
import com.mlorenzana.clinicappapi.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mlorenzana.clinicappapi.models.PatientModel;

import java.util.ArrayList;
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

//    public ResponseEntity<?> addPatient() {
//
//    }
}
