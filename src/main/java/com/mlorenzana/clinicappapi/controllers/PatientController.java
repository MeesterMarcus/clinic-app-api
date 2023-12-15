package com.mlorenzana.clinicappapi.controllers;

import com.mlorenzana.clinicappapi.entities.Patient;
import com.mlorenzana.clinicappapi.services.PatientService;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("api/patients")
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping()
    public List<Patient> getPatients() {
        return this.patientService.getPatients();
    }

    @PostMapping()
    @Transactional
    public void addPatient(@RequestBody Patient patient) {
        this.patientService.addPatient(patient);
    }

    @GetMapping(value="{id}")
    public Patient getPatientById(@PathVariable("id") Long id) {
        return this.patientService.getPatientById(id);
    }

    @PutMapping()
    public void saveNote(@RequestBody Patient patient) {
        this.patientService.save(patient);
    }

}
