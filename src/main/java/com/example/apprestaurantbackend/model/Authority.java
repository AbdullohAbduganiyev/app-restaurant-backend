package com.example.apprestaurantbackend.model;

import com.example.apprestaurantbackend.enums.PermissionEnum;
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
@Table(name = "permission")
public class Authority implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    UUID id;

    @Enumerated(EnumType.STRING)
    PermissionEnum name;

    public Authority(PermissionEnum name) {
        this.name = name;
    }

    @Override
    public String getAuthority() {
        return name.toString();
    }
}
