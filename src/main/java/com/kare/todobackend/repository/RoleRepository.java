package com.kare.todobackend.repository;

import java.util.Optional;

import com.kare.todobackend.model.ERole;
import com.kare.todobackend.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}