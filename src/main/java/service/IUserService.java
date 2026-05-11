package service;

import model.dto.UserResponseDTO;

public interface IUserService {
    // Obtener perfil de usuario por ID
    UserResponseDTO getById(Integer id);

    // Actualizar datos personales básicos
    UserResponseDTO updatePersonalData(Integer id, String firstName,
                                       String lastName, String userName);
}
