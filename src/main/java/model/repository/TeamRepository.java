package model.repository;

import model.entitie.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Integer> {
    // Para buscar por código FIFA cuando conectes la API externa
    java.util.Optional<Team> findByFifaCode(String fifaCode);
}
