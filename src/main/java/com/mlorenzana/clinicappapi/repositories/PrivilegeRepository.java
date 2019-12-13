package com.mlorenzana.clinicappapi.repositories;

import com.mlorenzana.clinicappapi.entities.AppPrivilege;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrivilegeRepository extends JpaRepository<AppPrivilege, Long> {

    AppPrivilege findPrivilegeByName(String name);

}
