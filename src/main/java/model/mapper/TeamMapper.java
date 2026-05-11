package model.mapper;

import model.dto.TeamSummaryDTO;
import model.entitie.Team;

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
