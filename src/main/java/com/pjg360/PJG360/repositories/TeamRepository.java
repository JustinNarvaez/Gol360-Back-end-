package com.pjg360.PJG360.repositories;

import com.pjg360.PJG360.model.entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Integer> {
    // Para buscar por código FIFA cuando conectes la API externa
    java.util.Optional<Team> findByFifaCode(String fifaCode);
}
