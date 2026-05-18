package com.pjg360.PJG360.repositories;

import com.pjg360.PJG360.model.entities.MatchStatistics;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchStatisticsRepository extends JpaRepository<MatchStatistics, Long> {
    Optional<MatchStatistics> findByMatchId(Long matchId);
}
