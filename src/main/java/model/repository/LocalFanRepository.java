package model.repository;

import model.entitie.LocalFan;
import model.entitie.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocalFanRepository extends JpaRepository<LocalFan, Integer> {
}
