package model.mapper;

import model.dto.StadiumSummaryDTO;
import model.entitie.Stadium;

import java.util.Collections;
import java.util.List;

public class StadiumMapper {

    public static StadiumSummaryDTO toDTO(Stadium stadium) {
        if (stadium == null) return null;
        return StadiumSummaryDTO.builder()
                .id(stadium.getId())
                .name(stadium.getName())
                .city(stadium.getCity())
                .build();
    }

    public static List<StadiumSummaryDTO> toDTOList(List<Stadium> stadiums) {
        if (stadiums == null) return Collections.emptyList();
        return stadiums.stream().map(StadiumMapper::toDTO).toList();
    }
}
