package com.example.apprestaurantbackend.model;

import com.example.apprestaurantbackend.model.template.AbsBaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.FieldDefaults;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Address extends AbsBaseEntity {
    @Column(nullable = false)
    String city;

    @Column(nullable = false)
    String street;

    @Column(nullable = false)
    String home;
}
