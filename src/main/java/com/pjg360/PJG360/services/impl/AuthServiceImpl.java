package com.pjg360.PJG360.services.impl;

import com.pjg360.PJG360.enums.UserType;
import com.pjg360.PJG360.model.dtos.AuthResponseDTO;
import com.pjg360.PJG360.model.dtos.LoginRequestDTO;
import com.pjg360.PJG360.model.dtos.RegisterRequestDTO;
import com.pjg360.PJG360.model.entities.*;
import com.pjg360.PJG360.model.mappers.UserMapper;
import com.pjg360.PJG360.repositories.*;
import com.pjg360.PJG360.services.IAuthService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements IAuthService {

    private final UserRepository userRepository;
    private final CityRepository cityRepository;
    private final TeamRepository teamRepository;
    private final StadiumRepository stadiumRepository;
    private final PreferenceRepository preferenceRepository;
    private final PasswordEncoder passwordEncoder;

    public AuthServiceImpl(UserRepository userRepository,
                           CityRepository cityRepository,
                           TeamRepository teamRepository,
                           StadiumRepository stadiumRepository,
                           PreferenceRepository preferenceRepository,
                           PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.cityRepository = cityRepository;
        this.teamRepository = teamRepository;
        this.stadiumRepository = stadiumRepository;
        this.preferenceRepository = preferenceRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public AuthResponseDTO register(RegisterRequestDTO dto) {

        if (userRepository.existsByEmail(dto.getEmail()))
            throw new RuntimeException("El email ya esta registrado");
        if (userRepository.existsByUserName(dto.getUserName()))
            throw new RuntimeException("El userName ya esta en uso");
        if (dto.getPreferences() == null)
            throw new RuntimeException("Las preferencias son obligatorias");

        if (dto.getUserType() == UserType.LOCAL_FAN) {
            LocalFan fan = UserMapper.toLocalFan(dto);
            fan.setPassword(passwordEncoder.encode(dto.getPassword()));
            userRepository.save(fan);
            guardarPreferencias(fan, dto);
            return UserMapper.toAuthDTO(fan);
        }

        if (dto.getUserType() == UserType.VISIT_FAN) {
            VisitFan fan = UserMapper.toVisitFan(dto);
            fan.setPassword(passwordEncoder.encode(dto.getPassword()));
            if (dto.getFavCityIds() != null && !dto.getFavCityIds().isEmpty())
                fan.setFavCities(cityRepository.findAllById(dto.getFavCityIds()));
            userRepository.save(fan);
            guardarPreferencias(fan, dto);
            return UserMapper.toAuthDTO(fan);
        }

        throw new RuntimeException("Tipo de usuario no valido");
    }

    @Override
    public AuthResponseDTO login(LoginRequestDTO dto) {
        var user = userRepository.findByEmail(dto.getIdentifier())
                .orElseGet(() -> userRepository.findByUserName(dto.getIdentifier())
                        .orElseThrow(() -> new RuntimeException("Usuario no encontrado")));

        if (!passwordEncoder.matches(dto.getPassword(), user.getPassword()))
            throw new RuntimeException("Contrasena incorrecta");

        return UserMapper.toAuthDTO(user);
    }

    @Override
    public String logout() {
        return "Sesion cerrada exitosamente";
    }

    private void guardarPreferencias(User user, RegisterRequestDTO dto) {
        Preference pref = new Preference();
        pref.setUser(user);
        pref.setFavNotifications(dto.getPreferences().getFavNotifications());
        pref.setFavNations(teamRepository.findAllById(
                dto.getPreferences().getFavNationIds().stream()
                        .map(Long::intValue).toList()));
        pref.setFavStadiums(stadiumRepository.findAllById(
                dto.getPreferences().getFavStadiumIds().stream()
                        .map(Long::intValue).toList()));
        preferenceRepository.save(pref);
    }
}