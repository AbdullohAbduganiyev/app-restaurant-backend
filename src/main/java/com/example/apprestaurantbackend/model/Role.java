package com.example.apprestaurantbackend.model;

import com.example.apprestaurantbackend.model.template.AbsBaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Role extends AbsBaseEntity {
    @Column(nullable = false, unique = true)
    String name;

    @ManyToMany
    List<Authority> permissions;
}
