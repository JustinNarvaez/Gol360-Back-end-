package com.pjg360.PJG360.controller;

import com.pjg360.PJG360.model.dtos.ChangePasswordRequestDTO;
import com.pjg360.PJG360.model.dtos.UserResponseDTO;
import com.pjg360.PJG360.model.dtos.UserUpdateRequestDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.pjg360.PJG360.services.IUserService;

import java.util.List;

@RestController
@RequestMapping("/pjg360/api")
public class UserController {

    private final IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    // Obtener todos los usuarios
    @GetMapping("/users")
    public ResponseEntity<List<UserResponseDTO>> obtenerTodos() {
        System.out.println("Listando todos los usuarios...");
        return new ResponseEntity<>(userService.getAll(), HttpStatus.OK);
    }

    // Obtener perfil de usuario por ID
    @GetMapping("/users/{id}")
    public ResponseEntity<UserResponseDTO> obtenerUsuario(@PathVariable Integer id) {
        System.out.println("Buscando usuario con ID: " + id);
        return new ResponseEntity<>(userService.getById(id), HttpStatus.OK);
    }

    // Actualizar datos personales (nombre, apellido, userName)
    @PutMapping("/users/{id}")
    public ResponseEntity<UserResponseDTO> actualizarDatos(
            @PathVariable Integer id,
            @RequestBody UserUpdateRequestDTO dto) {
        System.out.println("Actualizando datos del usuario con ID: " + id);
        UserResponseDTO updated = userService.updatePersonalData(
                id, dto.getFirstName(), dto.getLastName(), dto.getUserName(), dto.getEmail());
        return new ResponseEntity<>(updated, HttpStatus.OK);
    }

    // Cambiar contraseña   
    @PutMapping("/users/{id}/password")
    public ResponseEntity<String> cambiarContrasena(
            @PathVariable Integer id,
            @RequestBody ChangePasswordRequestDTO dto) {
        System.out.println("Cambiando contrasena del usuario con ID: " + id);
        return new ResponseEntity<>(userService.changePassword(id, dto), HttpStatus.OK);
    }
}