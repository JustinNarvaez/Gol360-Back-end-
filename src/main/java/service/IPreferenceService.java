package service;

import model.dto.PreferencesRequestDTO;
import model.dto.PreferencesResponseDTO;

public interface IPreferenceService {
    // Guardar o actualizar preferencias del usuario
    PreferencesResponseDTO savePreferences(Long userId, PreferencesRequestDTO dto);

    // Obtener preferencias del usuario
    PreferencesResponseDTO getPreferences(Long userId);
}
