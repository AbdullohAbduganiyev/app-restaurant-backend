package com.example.apprestaurantbackend.payload;

import jakarta.validation.constraints.NotBlank;

public record RefreshTokenDTO(@NotBlank String access,
                              @NotBlank String refresh) {
}
