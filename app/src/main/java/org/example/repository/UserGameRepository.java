package org.example.repository;


import org.example.entity.UserGame;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserGameRepository extends JpaRepository<UserGame,Long> {
}
