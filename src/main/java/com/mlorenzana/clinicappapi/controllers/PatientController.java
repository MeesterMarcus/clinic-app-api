package com.mlorenzana.clinicappapi.controllers;

import com.mlorenzana.clinicappapi.entities.PatientEntity;
import com.mlorenzana.clinicappapi.services.PatientService;
import com.mlorenzana.clinicappapi.models.PatientModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
