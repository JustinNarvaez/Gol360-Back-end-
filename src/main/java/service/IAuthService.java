package service;

import model.dto.AuthResponseDTO;
import model.dto.LoginRequestDTO;
import model.dto.RegisterRequestDTO;

public interface IAuthService {
    // Registra un LocalFan o VisitFan según el userType del DTO
    AuthResponseDTO register(RegisterRequestDTO dto);

    // Login con email o userName + password
    AuthResponseDTO login(LoginRequestDTO dto);
}
