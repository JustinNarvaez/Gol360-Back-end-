package com.pjg360.PJG360.model.dtos;

import com.pjg360.PJG360.enums.NotificationType;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

// Entrada: cliente → API al guardar preferencias
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PreferencesRequestDTO {

    // IDs de las selecciones favoritas
    @NotEmpty(message = "Selecciona al menos una selección")
    private List<Long> favNationIds;

    // IDs de los estadios favoritos
    @NotEmpty(message = "Selecciona al menos un estadio")
    private List<Long> favStadiumIds;

    // Tipos de notificación que quiere recibir
    @NotEmpty(message = "Selecciona al menos un tipo de notificación")
    private List<NotificationType> favNotifications;

    // Solo aplica si el usuario es VISIT_FAN
    private List<Long> favCityIds;
}
