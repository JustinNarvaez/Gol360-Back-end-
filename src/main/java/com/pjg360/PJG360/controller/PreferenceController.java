package com.pjg360.PJG360.controller;

import com.pjg360.PJG360.model.dtos.PreferencesRequestDTO;
import com.pjg360.PJG360.model.dtos.PreferencesResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.pjg360.PJG360.services.IPreferenceService;

@RestController
@RequestMapping("/pjg360/api")
public class PreferenceController {

    private final IPreferenceService preferenceService;

    public PreferenceController(IPreferenceService preferenceService) {
        this.preferenceService = preferenceService;
    }

    // Guardar preferencias del usuario (obligatorio al registrarse)
    @PostMapping("/preferences/{userId}")
    public ResponseEntity<PreferencesResponseDTO> guardarPreferencias(
            @PathVariable Long userId,
            @RequestBody PreferencesRequestDTO dto) {
        System.out.println("Guardando preferencias del usuario con ID: " + userId);
        PreferencesResponseDTO response = preferenceService.savePreferences(userId, dto);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    // Obtener preferencias del usuario
    @GetMapping("/preferences/{userId}")
    public ResponseEntity<PreferencesResponseDTO> obtenerPreferencias(
            @PathVariable Long userId) {
        System.out.println("Obteniendo preferencias del usuario con ID: " + userId);
        return new ResponseEntity<>(preferenceService.getPreferences(userId), HttpStatus.OK);
    }

    // Actualizar preferencias existentes
    @PutMapping("/preferences/{userId}")
    public ResponseEntity<PreferencesResponseDTO> actualizarPreferencias(
            @PathVariable Long userId,
            @RequestBody PreferencesRequestDTO dto) {
        System.out.println("Actualizando preferencias del usuario con ID: " + userId);
        PreferencesResponseDTO response = preferenceService.savePreferences(userId, dto);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}