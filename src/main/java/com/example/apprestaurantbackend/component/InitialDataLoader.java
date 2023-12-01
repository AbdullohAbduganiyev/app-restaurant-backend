package com.example.apprestaurantbackend.component;

import com.example.apprestaurantbackend.config.PropertyMapper;
import com.example.apprestaurantbackend.model.Authority;
import com.example.apprestaurantbackend.enums.PermissionEnum;
import com.example.apprestaurantbackend.model.Role;
import com.example.apprestaurantbackend.model.User;
import com.example.apprestaurantbackend.repository.AuthorityRepository;
import com.example.apprestaurantbackend.repository.RoleRepository;
import com.example.apprestaurantbackend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Component
@RequiredArgsConstructor
public class InitialDataLoader implements CommandLineRunner {

    private final PropertyMapper propertyMapper;
    private final RoleRepository roleRepository;
    private final AuthorityRepository authorityRepository;
    private final UserRepository userRepository;


    @Value("${spring.jpa.hibernate.ddl-auto}")
    private String ddl;

    @Override
    public void run(String... args) throws Exception {
        if (!ddl.equalsIgnoreCase("create")) return;

        List<Authority> authorities = authorityRepository.saveAll(Arrays
                .stream(PermissionEnum.values())
                .map(Authority::new)
                .toList());

        Role superAdminRole = propertyMapper.getRole();
        superAdminRole.setPermissions(authorities);
        superAdminRole.setCreatedAt(Timestamp.valueOf(LocalDateTime.now()));

        roleRepository.save(superAdminRole);

        User superAdmin = propertyMapper.getUser();
        superAdmin.setRoles(List.of(superAdminRole));
        superAdmin.setEnabled(true);

        userRepository.save(superAdmin);
    }
}
