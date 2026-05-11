package com.pjg360.PJG360.model.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChangePasswordRequestDTO {

    @NotBlank(message = "La contrasena actual es obligatoria")
    private String currentPassword;

    @NotBlank(message = "La nueva contrasena es obligatoria")
    @Size(min = 8, message = "Minimo 8 caracteres")
    private String newPassword;

    @NotBlank(message = "Confirma la nueva contrasena")
    private String confirmPassword;
}