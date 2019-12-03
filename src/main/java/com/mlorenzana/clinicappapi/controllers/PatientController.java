package com.mlorenzana.clinicappapi.controllers;

import com.mlorenzana.clinicappapi.entities.PatientEntity;
import com.mlorenzana.clinicappapi.services.PatientService;
import com.mlorenzana.clinicappapi.models.PatientModel;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("api")
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping(value="getPatients")
    public List<PatientEntity> getPatients() {
        return this.patientService.getPatients();
    }

    @PostMapping(path="addPatient")
    @Transactional
    public void addPatient(@RequestBody PatientEntity patientEntity) {
        this.patientService.addPatient(patientEntity);
    }

}
