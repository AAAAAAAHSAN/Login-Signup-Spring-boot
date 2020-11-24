package com.example.ahsan.millennium.repository;

import com.example.ahsan.millennium.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

     Role findByRole(String role);
}
