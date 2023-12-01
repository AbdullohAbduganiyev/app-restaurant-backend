package com.example.apprestaurantbackend.payload;

import lombok.experimental.UtilityClass;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Arrays;
import java.util.List;

public record ApiResponse<T>(
        String message,
        boolean success,
        T data,
        List<ErrorDTO> errors) {

    public <S> ApiResponse<S> success(S data, String... msg) {
        return new ApiResponse<>(Arrays.toString(msg), true, data, null);
    }

    public <E> ApiResponse<E> failed(String msg, List<ErrorDTO> errors) {
        return new ApiResponse<>(msg, false, null, errors);
    }
}
