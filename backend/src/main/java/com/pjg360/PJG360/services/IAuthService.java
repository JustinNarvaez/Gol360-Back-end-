package com.pjg360.PJG360.services;

import com.pjg360.PJG360.model.dtos.AuthResponseDTO;
import com.pjg360.PJG360.model.dtos.LoginRequestDTO;
import com.pjg360.PJG360.model.dtos.RegisterRequestDTO;

public interface IAuthService {
    // Registra un LocalFan o VisitFan según el userType del DTO
    AuthResponseDTO register(RegisterRequestDTO dto);

    // Login con email o userName + password
    AuthResponseDTO login(LoginRequestDTO dto);

    String logout();
}
