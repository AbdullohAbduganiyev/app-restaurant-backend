package com.example.apprestaurantbackend.payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import static com.example.apprestaurantbackend.util.AppConstant.MAX_PASSWORD_LENGTH;
import static com.example.apprestaurantbackend.util.AppConstant.MIN_PASSWORD_LENGTH;

public record LoginDTO(@NotBlank @Email String email,
                       @NotBlank @Size(min = MIN_PASSWORD_LENGTH, max = MAX_PASSWORD_LENGTH) String password) {

}
