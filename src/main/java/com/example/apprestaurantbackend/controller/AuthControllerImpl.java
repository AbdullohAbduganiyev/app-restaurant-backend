package com.example.apprestaurantbackend.controller;

import com.example.apprestaurantbackend.payload.*;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;
import java.util.UUID;

@RestController
public class AuthControllerImpl implements AuthController {
    @Override
    public HttpResponse<ApiResponse<String>> signUp(RegisterDTO registerDTO) {
        // todo Ibrokhim, 1. Check password and prepassword,
        // todo conflict bazada bormi yo'qmi
        // save

        return null; // success message
    }

    @Override
    public HttpResponse<ApiResponse<String>> confirm(UUID id) {
        // todo Abdulloh akak find from database by id
        // enabled = true
        // agar enabled true bolsa , bu urel eskirgan
        //
        return null; // success message
    }

    @Override
    public HttpResponse<ApiResponse<TokenDTO>> login(LoginDTO loginDTO) {
        return null;
    }

    @Override
    public HttpResponse<ApiResponse<TokenDTO>> refreshToken(RefreshTokenDTO refreshTokenDTO) {
        return null;
    }
}
