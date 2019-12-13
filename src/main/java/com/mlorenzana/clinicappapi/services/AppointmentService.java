package com.mlorenzana.clinicappapi.services;


import com.mlorenzana.clinicappapi.entities.Appointment;
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

    public List<Appointment> getAppts() {
        return this.appointmentRepository.findAll();
    }

    public Appointment getApptById(Long id) {
        return this.appointmentRepository.getById(id);
    }

    public void addAppt(Appointment entity) {
        this.appointmentRepository.save(entity);
    }

    public void complete(Long id) {
        Appointment entity = this.appointmentRepository.getOne(id);
        entity.setComplete("Y");
        this.appointmentRepository.save(entity);
    }

    public void clear() {
        this.appointmentRepository.clear();
    }

    public void save(Appointment entity) {
        this.appointmentRepository.save(entity);
    }
}
