package com.pjg360.PJG360.model.mappers;

import com.pjg360.PJG360.model.dtos.PreferencesRequestDTO;
import com.pjg360.PJG360.model.dtos.PreferencesResponseDTO;
import com.pjg360.PJG360.model.entities.Preference;

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
