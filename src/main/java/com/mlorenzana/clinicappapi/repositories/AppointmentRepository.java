package com.mlorenzana.clinicappapi.repositories;

import com.mlorenzana.clinicappapi.entities.AppointmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface AppointmentRepository extends JpaRepository<AppointmentEntity, Long> {

    @Modifying
    @Query("DELETE FROM AppointmentEntity a WHERE a.complete = 'Y'")
    void clear();

    AppointmentEntity getById(Long id);

}
