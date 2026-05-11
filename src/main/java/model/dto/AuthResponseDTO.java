package model.dto;

import enums.UserType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthResponseDTO {

    private String token;       // JWT
    private String tokenType;   // "Bearer"

    // Info básica del usuario autenticado
    private Long id;
    private String userName;
    private String email;
    private UserType userType;
}
