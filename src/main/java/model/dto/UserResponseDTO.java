package model.dto;

import enums.UserType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserResponseDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private LocalDate registerDate;
    private UserType userType;

    // Preferencias del usuario (puede ser null si aún no las configuró)
    private PreferencesResponseDTO preferences;

    // Solo viene si userType = VISIT_FAN
    private Boolean notificationsEnabled;
}
