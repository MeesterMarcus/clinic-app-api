package com.mlorenzana.clinicappapi.controllers;

import com.mlorenzana.clinicappapi.entities.Patient;
import com.mlorenzana.clinicappapi.services.PatientService;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("api/patients")
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping(value="getPatients")
    public List<Patient> getPatients() {
        return this.patientService.getPatients();
    }

    @PostMapping(path="addPatient")
    @Transactional
    public void addPatient(@RequestBody Patient patient) {
        this.patientService.addPatient(patient);
    }

    @GetMapping(value="getPatient/{id}")
    public Patient getPatientById(@PathVariable("id") Long id) {
        return this.patientService.getPatientById(id);
    }

    @PostMapping(path="save")
    public void saveNote(@RequestBody Patient patient) {
        this.patientService.save(patient);
    }

}
