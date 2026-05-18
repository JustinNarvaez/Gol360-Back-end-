package com.pjg360.PJG360.model.dtos;

import com.pjg360.PJG360.enums.UserType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegisterRequestDTO {

    @NotBlank(message = "El nombre es obligatorio")
    private String firstName;

    @NotBlank(message = "El apellido es obligatorio")
    private String lastName;

    @NotBlank(message = "El usuario es obligatorio")
    private String userName;

    @Email(message = "Email no válido")
    @NotBlank(message = "El email es obligatorio")
    private String email;

    @NotBlank(message = "La contraseña es obligatoria")
    @Size(min = 8, message = "Mínimo 8 caracteres")
    private String password;

    @NotNull(message = "El tipo de usuario es obligatorio")
    private UserType userType;

    // Preferencias obligatorias al registrarse
    @NotNull(message = "Las preferencias son obligatorias")
    private PreferencesRequestDTO preferences;

    // Solo aplica si userType = VISIT_FAN
    // Se ignora si es LOCAL_FAN
    private List<Integer> favCityIds;
}
