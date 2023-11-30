package com.example.apprestaurantbackend.model;

import com.example.apprestaurantbackend.model.template.AbsBaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.*;
import lombok.experimental.FieldDefaults;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Customer extends AbsBaseEntity {
    @Column(nullable = false)
    String fullName;

    @OneToOne(optional = false)
    User user;
}
