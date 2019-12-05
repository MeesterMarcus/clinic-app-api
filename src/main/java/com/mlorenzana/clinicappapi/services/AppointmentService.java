package com.mlorenzana.clinicappapi.services;


import com.mlorenzana.clinicappapi.entities.AppointmentEntity;
import com.mlorenzana.clinicappapi.repositories.AppointmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AppointmentService {

    final
    AppointmentRepository appointmentRepository;

    public AppointmentService(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    public List<AppointmentEntity> getAppts() {
        return this.appointmentRepository.findAll();
    }

    public void addAppt(AppointmentEntity entity) {
        this.appointmentRepository.save(entity);
    }
}
