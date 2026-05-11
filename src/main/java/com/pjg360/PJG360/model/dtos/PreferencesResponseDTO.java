package com.pjg360.PJG360.model.dtos;

import com.pjg360.PJG360.enums.NotificationType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PreferencesResponseDTO {

    private Long id;

    // Nombre + código FIFA de cada selección
    private List<TeamSummaryDTO> favNations;

    // Nombre + ciudad de cada estadio
    private List<StadiumSummaryDTO> favStadiums;

    private List<NotificationType> favNotifications;

    // Solo viene si userType = VISIT_FAN
    private List<CitySummaryDTO> favCities;
}
