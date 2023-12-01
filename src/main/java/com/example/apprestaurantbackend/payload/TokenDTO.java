package com.example.apprestaurantbackend.payload;

public record TokenDTO(String access,
                       String refresh) {
    public static TokenDTO getInstance(String access, String refresh) {
        return new TokenDTO(access, refresh);
    }
}
