package com.example.apprestaurantbackend.repository;

import com.example.apprestaurantbackend.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RoleRepository extends JpaRepository<Role, UUID> {

}
