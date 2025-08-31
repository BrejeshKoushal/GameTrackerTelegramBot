package org.example.repository;

import org.example.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GameRepository extends JpaRepository<Game,Long> {
    Optional<Game> findByGameNameIgnoreCase(String gameName);
}
