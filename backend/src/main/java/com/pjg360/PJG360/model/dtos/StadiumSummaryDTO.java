package com.pjg360.PJG360.model.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StadiumSummaryDTO {
    private Long id;
    private String name;
    private String city;

}
