package model.mapper;

import model.dto.PreferencesRequestDTO;
import model.dto.PreferencesResponseDTO;
import model.entitie.Preference;

public class PreferencesMapper {

    public static PreferencesResponseDTO toDTO(Preference pref) {
        if (pref == null) return null;
        return PreferencesResponseDTO.builder()
                .id(pref.getId())
                .favNations(TeamMapper.toDTOList(pref.getFavNations()))
                .favStadiums(StadiumMapper.toDTOList(pref.getFavStadiums()))
                .favNotifications(pref.getFavNotifications())
                .build();

    }

    public static Preference toEntity(PreferencesRequestDTO dto) {
        if (dto == null) return null;
        Preference pref = new Preference();
        pref.setFavNotifications(dto.getFavNotifications());
        return pref;
    }
}
