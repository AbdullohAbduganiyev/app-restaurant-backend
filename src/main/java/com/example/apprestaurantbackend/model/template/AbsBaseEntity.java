package com.example.apprestaurantbackend.model.template;

import com.example.apprestaurantbackend.model.User;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.sql.Timestamp;
import java.util.UUID;

@MappedSuperclass
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class AbsBaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    UUID id;

    @CreatedDate
    Timestamp createdAt;

    @LastModifiedDate
    Timestamp updatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @CreatedBy
    User createdBy;

    @ManyToOne(fetch = FetchType.LAZY)
    @LastModifiedBy
    User updatedBy;
}
