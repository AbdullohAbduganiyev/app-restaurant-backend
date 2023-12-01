package com.example.apprestaurantbackend.repository;

import com.example.apprestaurantbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

}
