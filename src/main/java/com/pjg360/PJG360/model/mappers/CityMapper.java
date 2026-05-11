package com.pjg360.PJG360.model.mappers;

import com.pjg360.PJG360.model.dtos.CitySummaryDTO;
import com.pjg360.PJG360.model.entities.City;

import java.util.Collections;
import java.util.List;

public class CityMapper {
    public static CitySummaryDTO toDTO(City city) {
        if (city == null) return null;
        return CitySummaryDTO.builder()
                .id(city.getId())
                .name(city.getName())
                .country(city.getCountry())
                .iataCode(city.getIataCode())
                .build();
    }

    public static List<CitySummaryDTO> toDTOList(List<City> cities) {
        if (cities == null) return Collections.emptyList();
        return cities.stream().map(CityMapper::toDTO).toList();
    }
}
