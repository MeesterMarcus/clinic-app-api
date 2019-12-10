package com.mlorenzana.clinicappapi.controllers;

import com.mlorenzana.clinicappapi.entities.AppointmentEntity;
import com.mlorenzana.clinicappapi.services.AppointmentService;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/appt")
public class AppointmentController {

    private final AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @GetMapping(value="getAppts")
    public List<AppointmentEntity> getAppts() {
        return this.appointmentService.getAppts();
    }

    @GetMapping(value="getAppt/{id}")
    public AppointmentEntity getPatientById(@PathVariable("id") Long id) {
        return this.appointmentService.getApptById(id);
    }

    @PostMapping(path="addAppt")
    @Transactional
    public void addAppt(@RequestBody AppointmentEntity appointmentEntity) {
        this.appointmentService.addAppt(appointmentEntity);
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
    public void saveNote(@RequestBody AppointmentEntity appointmentEntity) {
        this.appointmentService.save(appointmentEntity);
    }

}
