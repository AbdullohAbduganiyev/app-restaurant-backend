package com.example.apprestaurantbackend.model;

import com.example.apprestaurantbackend.enums.GenderEnum;
import com.example.apprestaurantbackend.model.template.AbsBaseEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Employee extends AbsBaseEntity {
    @Column(nullable = false)
    String firstName;

    @Column(nullable = false)
    String lastName;

    @OneToOne
    Address address;

    @OneToOne(optional = false)
    User user;

    // telegram, ...
    String extraContact;

    @Enumerated(EnumType.STRING)
    GenderEnum gender;
}
