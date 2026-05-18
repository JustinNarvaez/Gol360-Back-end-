package com.pjg360.PJG360.repositories;

import com.pjg360.PJG360.model.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlayerRepository  extends JpaRepository<Player, Long> {
    List<Player> findByTeamId(Long teamId);
}
