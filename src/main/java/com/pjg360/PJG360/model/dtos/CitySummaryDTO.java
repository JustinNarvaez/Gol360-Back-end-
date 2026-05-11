package com.pjg360.PJG360.model.dtos;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CitySummaryDTO {
    private Long id;
    private String name;
    private String country;
    private String iataCode;
}
