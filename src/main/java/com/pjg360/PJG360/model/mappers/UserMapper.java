package com.pjg360.PJG360.model.mappers;

import com.pjg360.PJG360.model.dtos.AuthResponseDTO;
import com.pjg360.PJG360.model.dtos.RegisterRequestDTO;
import com.pjg360.PJG360.model.dtos.UserResponseDTO;
import com.pjg360.PJG360.model.entities.LocalFan;
import com.pjg360.PJG360.model.entities.User;
import com.pjg360.PJG360.model.entities.VisitFan;
import com.pjg360.PJG360.enums.UserType;
import java.util.Collections;
import java.util.List;

public class UserMapper {

    public static UserResponseDTO toDTO(User user) {
        if (user == null) return null;
        return UserResponseDTO.builder()
                .id(user.getId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .userName(user.getUserName())
                .email(user.getEmail())
                .registerDate(user.getRegisterDate())
                .userType(user.getUserType())
                .preferences(PreferencesMapper.toDTO(user.getPreferences()))
                .notificationsEnabled(resolveNotifications(user))
                .build();
    }

    public static AuthResponseDTO toAuthDTO(User user) {
        if (user == null) return null;
        return AuthResponseDTO.builder()
                .tokenType("Bearer")
                .id(user.getId())
                .userName(user.getUserName())
                .email(user.getEmail())
                .userType(user.getUserType())
                .build();
    }

    public static LocalFan toLocalFan(RegisterRequestDTO dto) {
        if (dto == null) return null;
        LocalFan fan = new LocalFan();
        fan.setFirstName(dto.getFirstName());
        fan.setLastName(dto.getLastName());
        fan.setUserName(dto.getUserName());
        fan.setEmail(dto.getEmail());
        fan.setUserType(UserType.LOCAL_FAN);
        fan.setNotificationsEnabled(true);
        return fan;
    }

    public static VisitFan toVisitFan(RegisterRequestDTO dto) {
        if (dto == null) return null;
        VisitFan fan = new VisitFan();
        fan.setFirstName(dto.getFirstName());
        fan.setLastName(dto.getLastName());
        fan.setUserName(dto.getUserName());
        fan.setEmail(dto.getEmail());
        fan.setUserType(UserType.VISIT_FAN);
        fan.setNotificationsEnabled(true);
        return fan;
    }

    public static List<UserResponseDTO> toDTOList(List<User> users) {
        if (users == null) return Collections.emptyList();
        return users.stream().map(UserMapper::toDTO).toList();
    }

    private static Boolean resolveNotifications(User user) {
        if (user instanceof LocalFan lf) return lf.getNotificationsEnabled();
        if (user instanceof VisitFan vf) return vf.getNotificationsEnabled();
        return null;
    }
}