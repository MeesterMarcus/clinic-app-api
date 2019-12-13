package com.mlorenzana.clinicappapi.repositories;

import com.mlorenzana.clinicappapi.entities.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    @Modifying
    @Query("DELETE FROM Appointment a WHERE a.complete = 'Y'")
    void clear();

    Appointment getById(Long id);

}
