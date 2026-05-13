package com.pjg360.PJG360.repositories;

import com.pjg360.PJG360.enums.MatchStatus;
import com.pjg360.PJG360.enums.TournamentPhase;
import com.pjg360.PJG360.model.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MatchRepository extends JpaRepository<Match, Long> {
    List<Match> findByPhase(TournamentPhase phase);
    List<Match> findByStatus(MatchStatus status);
    List<Match> findByHomeTeamFifaCodeOrAwayTeamFifaCode(String home, String away);
    List<Match> findByRoundName(String roundName);
}
