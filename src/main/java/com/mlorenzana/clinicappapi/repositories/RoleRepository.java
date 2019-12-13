package com.mlorenzana.clinicappapi.repositories;

import com.mlorenzana.clinicappapi.entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<AppRole, Long> {

    AppRole findRoleByName(String name);
}
