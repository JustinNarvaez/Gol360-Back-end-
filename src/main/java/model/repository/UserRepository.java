package model.repository;

import model.entitie.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);
    Optional<User> findByUserName(String userName);
    Boolean existsByEmail(String email);
    Boolean existsByUserName(String userName);
}
