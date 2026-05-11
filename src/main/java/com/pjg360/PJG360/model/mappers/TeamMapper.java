package com.pjg360.PJG360.model.mappers;

import com.pjg360.PJG360.model.dtos.TeamSummaryDTO;
import com.pjg360.PJG360.model.entities.Team;

import java.util.Collections;
import java.util.List;

public class TeamMapper {

    public static TeamSummaryDTO toDTO(Team team) {
        if (team == null) return null;
        return TeamSummaryDTO.builder()
                .id(team.getId())
                .name(team.getName())
                .fifaCode(team.getFifaCode())
                .flagUrl(team.getFlagUrl())
                .build();
    }

    public static List<TeamSummaryDTO> toDTOList(List<Team> teams) {
        if (teams == null) return Collections.emptyList();
        return teams.stream().map(TeamMapper::toDTO).toList();
    }
}
