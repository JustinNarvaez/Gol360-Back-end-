package service.impl;

import enums.UserType;
import model.dto.AuthResponseDTO;
import model.dto.LoginRequestDTO;
import model.dto.RegisterRequestDTO;
import model.entitie.LocalFan;
import model.entitie.VisitFan;
import model.mapper.UserMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import model.repository.CityRepository;
import model.repository.UserRepository;
import service.IAuthService;

@Service
public class AuthServiceImpl implements IAuthService {

    private final UserRepository userRepository;
    private final CityRepository cityRepository;
    private final PasswordEncoder passwordEncoder;

    public AuthServiceImpl(UserRepository userRepository,
                           CityRepository cityRepository,
                           PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.cityRepository = cityRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public AuthResponseDTO register(RegisterRequestDTO dto) {

        // Validar que email y userName no existan
        if (userRepository.existsByEmail(dto.getEmail()))
            throw new RuntimeException("El email ya está registrado");

        if (userRepository.existsByUserName(dto.getUserName()))
            throw new RuntimeException("El userName ya está en uso");

        // Crear el fan según su tipo
        if (dto.getUserType() == UserType.LOCAL_FAN) {
            LocalFan fan = UserMapper.toLocalFan(dto);
            fan.setPassword(passwordEncoder.encode(dto.getPassword()));
            userRepository.save(fan);
            return UserMapper.toAuthDTO(fan);
        }

        if (dto.getUserType() == UserType.VISIT_FAN) {
            VisitFan fan = UserMapper.toVisitFan(dto);
            fan.setPassword(passwordEncoder.encode(dto.getPassword()));

            // Asignar ciudades favoritas si vienen en el DTO
            if (dto.getFavCityIds() != null && !dto.getFavCityIds().isEmpty()) {
                fan.setFavCities(cityRepository.findAllById(dto.getFavCityIds()));
            }

            userRepository.save(fan);
            return UserMapper.toAuthDTO(fan);
        }

        throw new RuntimeException("Tipo de usuario no válido para registro");
    }

    @Override
    public AuthResponseDTO login(LoginRequestDTO dto) {

        // Buscar por email o por userName
        var user = userRepository.findByEmail(dto.getIdentifier())
                .orElseGet(() -> userRepository.findByUserName(dto.getIdentifier())
                        .orElseThrow(() -> new RuntimeException("Usuario no encontrado")));

        // Validar contraseña
        if (!passwordEncoder.matches(dto.getPassword(), user.getPassword()))
            throw new RuntimeException("Contraseña incorrecta");

        return UserMapper.toAuthDTO(user);
    }
}