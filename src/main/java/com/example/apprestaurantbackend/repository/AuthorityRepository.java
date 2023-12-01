package com.example.apprestaurantbackend.repository;

import com.example.apprestaurantbackend.model.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AuthorityRepository extends JpaRepository<Authority, UUID> {

}
