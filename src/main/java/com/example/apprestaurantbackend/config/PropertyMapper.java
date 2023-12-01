package com.example.apprestaurantbackend.config;

import com.example.apprestaurantbackend.model.Role;
import com.example.apprestaurantbackend.model.User;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@ConfigurationProperties(prefix = "app")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Setter
public class PropertyMapper {
    User user;
    Role role;
}
