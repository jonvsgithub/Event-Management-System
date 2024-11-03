package net.enjoy.springboot.eventmanagement.repository;

import net.enjoy.springboot.eventmanagement.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}