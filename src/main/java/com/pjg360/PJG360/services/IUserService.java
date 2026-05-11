package com.pjg360.PJG360.services;

import com.pjg360.PJG360.model.dtos.UserResponseDTO;

import java.util.List;

public interface IUserService {
    // Obtener todos los usuarios
    List<UserResponseDTO> getAll();

    // Obtener perfil de usuario por ID
    UserResponseDTO getById(Integer id);

    // Actualizar datos personales básicos
    UserResponseDTO updatePersonalData(Integer id, String firstName,
                                       String lastName, String userName, String email);
}
