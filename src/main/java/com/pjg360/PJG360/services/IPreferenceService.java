package com.pjg360.PJG360.services;

import com.pjg360.PJG360.model.dtos.PreferencesRequestDTO;
import com.pjg360.PJG360.model.dtos.PreferencesResponseDTO;

public interface IPreferenceService {
    // Guardar o actualizar preferencias del usuario
    PreferencesResponseDTO savePreferences(Long userId, PreferencesRequestDTO dto);

    // Obtener preferencias del usuario
    PreferencesResponseDTO getPreferences(Long userId);
}
