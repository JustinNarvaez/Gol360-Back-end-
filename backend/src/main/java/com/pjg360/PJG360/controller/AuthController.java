package com.pjg360.PJG360.controller;

import com.pjg360.PJG360.model.dtos.AuthResponseDTO;
import com.pjg360.PJG360.model.dtos.LoginRequestDTO;
import com.pjg360.PJG360.model.dtos.RegisterRequestDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.pjg360.PJG360.services.IAuthService;

@RestController
@RequestMapping("/pjg360/api")
public class AuthController {

    private final IAuthService authService;

    public AuthController(IAuthService authService) {
        this.authService = authService;
    }

    // Registrar un nuevo aficionado (local o viajero)
    @PostMapping("/auth/register")
    public ResponseEntity<AuthResponseDTO> register(@RequestBody RegisterRequestDTO dto) {
        System.out.println("Registrando nuevo usuario: " + dto.getUserName());
        AuthResponseDTO response = authService.register(dto);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    // Iniciar sesión con email o userName
    @PostMapping("/auth/login")
    public ResponseEntity<AuthResponseDTO> login(@RequestBody LoginRequestDTO dto) {
        System.out.println("Inicio de sesión: " + dto.getIdentifier());
        AuthResponseDTO response = authService.login(dto);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    // Cerrar sesión
    @PostMapping("/auth/logout")
    public ResponseEntity<String> logout() {
        System.out.println("Cerrando sesion...");
        return new ResponseEntity<>(authService.logout(), HttpStatus.OK);
    }
}