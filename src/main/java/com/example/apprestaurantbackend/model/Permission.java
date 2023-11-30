package com.example.apprestaurantbackend.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.security.core.GrantedAuthority;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Permission implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    UUID id;

    @Enumerated(EnumType.STRING)
    PermissionEnum permission;

    @Override
    public String getAuthority() {
        return permission.name();
    }
}
