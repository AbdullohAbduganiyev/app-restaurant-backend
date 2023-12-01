package com.example.apprestaurantbackend;

import com.example.apprestaurantbackend.config.PropertyMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties({PropertyMapper.class})
@SpringBootApplication
public class AppRestaurantBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppRestaurantBackendApplication.class, args);
    }

}
