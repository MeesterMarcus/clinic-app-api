package com.mlorenzana.clinicappapi.repositories;

import com.mlorenzana.clinicappapi.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<AppUser, Long> {

    AppUser findAppUserByEmail(String email);

}
