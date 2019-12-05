package com.mlorenzana.clinicappapi.repositories;

import com.mlorenzana.clinicappapi.entities.AppointmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<AppointmentEntity, String> {
}
