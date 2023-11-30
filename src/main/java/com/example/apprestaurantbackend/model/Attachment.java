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
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Attachment extends AbsBaseEntity {
    @Column(nullable = false)
    String originalName;

    long size;

    @Column(nullable = false)
    String contentType;

    @Column(nullable = false)
    String url;
}
