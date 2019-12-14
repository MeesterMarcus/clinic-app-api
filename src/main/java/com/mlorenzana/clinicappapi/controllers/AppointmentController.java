package com.mlorenzana.clinicappapi.controllers;

import com.mlorenzana.clinicappapi.entities.Appointment;
import com.mlorenzana.clinicappapi.services.AppointmentService;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("api/appt")
public class AppointmentController {

    private final AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @GetMapping(value="getAppts")
    public List<Appointment> getAppts() {
        return this.appointmentService.getAppts();
    }

    @GetMapping(value="getAppt/{id}")
    public Appointment getPatientById(@PathVariable("id") Long id) {
        return this.appointmentService.getApptById(id);
    }

    @PostMapping(path="addAppt")
    @Transactional
    public void addAppt(@RequestBody Appointment appointment) {
        this.appointmentService.addAppt(appointment);
    }

    @PostMapping(path="complete")
    @Transactional
    public void complete(@RequestBody Map<String,Long> map) {
        this.appointmentService.complete(map.get("id"));
    }

    @DeleteMapping(path="clear")
    @Transactional
    public void clear() {
        this.appointmentService.clear();
    }

    @PostMapping(path="save")
    public void saveNote(@RequestBody Appointment appointment) {
        this.appointmentService.save(appointment);
    }

}
