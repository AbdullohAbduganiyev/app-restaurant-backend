package com.example.apprestaurantbackend.controller;

import com.example.apprestaurantbackend.payload.*;
import com.example.apprestaurantbackend.util.PathUtil;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.UUID;

@RequestMapping(AuthController.Path.BASE)
public interface AuthController {

    interface Path {
        String BASE = PathUtil.BASE_PATH + "/auth";
        String SIGN_UP = "/sign-up";
        String LOGIN = "/login";
        String REFRESH_TOKEN = "/refresh-token";
        String CONFIRM = "/confirm/{id}";
    }

    /**
     * This method is for register
     * @return message (<i style="color: lime">success</i>, <i style="color: red">failed</i>)
     */
    @PostMapping(Path.SIGN_UP)
    HttpResponse<ApiResponse<String>> signUp(@Valid @RequestBody RegisterDTO registerDTO);

    /**
     * This method get method and it is for confirming user
     * @param id is id of user
     * @return success or failed
     */
    @GetMapping(Path.CONFIRM)
    HttpResponse<ApiResponse<String>> confirm(@PathVariable UUID id);

    /**
     * This method is for login
     * @param loginDTO consists email and password
     * @return TokenDTO (access and refresh tokens)
     */
    @PostMapping(Path.LOGIN)
    HttpResponse<ApiResponse<TokenDTO>> login(@Valid @RequestBody LoginDTO loginDTO);

    /**
     * This method returns refresh tokens
     * @param refreshTokenDTO new access and refresh token
     * @return TokenDTO
     */
    @GetMapping(Path.REFRESH_TOKEN)
    HttpResponse<ApiResponse<TokenDTO>> refreshToken(@Valid @RequestBody RefreshTokenDTO refreshTokenDTO);

}
