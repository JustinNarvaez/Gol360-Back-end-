package com.pjg360.PJG360.services.impl;

import com.pjg360.PJG360.model.dtos.UserResponseDTO;
import com.pjg360.PJG360.model.mappers.UserMapper;
import org.springframework.stereotype.Service;
import com.pjg360.PJG360.repositories.UserRepository;
import com.pjg360.PJG360.services.IUserService;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserResponseDTO> getAll() {
        return userRepository.findAll()
                .stream()
                .map(UserMapper::toDTO)
                .toList();
    }

    @Override
    public UserResponseDTO getById(Integer id) {
        var user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
        return UserMapper.toDTO(user);
    }

    @Override
    public UserResponseDTO updatePersonalData(Integer id, String firstName,
                                              String lastName, String userName, String email) {
        var user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        if (userRepository.existsByUserName(userName) && !user.getUserName().equals(userName))
            throw new RuntimeException("El userName ya está en uso");

        if (userRepository.existsByEmail(email) && !user.getEmail().equals(email))
            throw new RuntimeException("El email ya está en uso");

        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setUserName(userName);
        user.setEmail(email);
        userRepository.save(user);
        return UserMapper.toDTO(user);
    }
}