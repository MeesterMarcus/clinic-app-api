package com.mlorenzana.clinicappapi.controllers;

import com.mlorenzana.clinicappapi.entities.AppointmentEntity;
import com.mlorenzana.clinicappapi.services.AppointmentService;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("api")
public class AppointmentController {

    private final AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @GetMapping(value="getAppts")
    public List<AppointmentEntity> getAppts() {
        return this.appointmentService.getAppts();
    }

    @PostMapping(path="addAppt")
    @Transactional
    public void addAppt(@RequestBody AppointmentEntity appointmentEntity) {
        this.appointmentService.addAppt(appointmentEntity);
    }

}
