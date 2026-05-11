package service.impl;

import model.dto.UserResponseDTO;
import model.mapper.UserMapper;
import model.repository.UserRepository;
import service.IUserService;

public class UserServiceImpl implements IUserService {


    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserResponseDTO getById(Integer id) {
        var user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
        return UserMapper.toDTO(user);
    }

    @Override
    public UserResponseDTO updatePersonalData(Integer id, String firstName,
                                              String lastName, String userName) {
        var user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setUserName(userName);

        userRepository.save(user);
        return UserMapper.toDTO(user);
    }
}
