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

    public AppointmentEntity getApptById(Long id) {
        return this.appointmentRepository.getById(id);
    }

    public void addAppt(AppointmentEntity entity) {
        this.appointmentRepository.save(entity);
    }

    public void complete(Long id) {
        AppointmentEntity entity = this.appointmentRepository.getOne(id);
        entity.setComplete("Y");
        this.appointmentRepository.save(entity);
    }

    public void clear() {
        this.appointmentRepository.clear();
    }

    public void save(AppointmentEntity entity) {
        this.appointmentRepository.save(entity);
    }
}
