package org.example.repository;


import jakarta.transaction.Transactional;
import org.example.entity.Game;
import org.example.entity.UserGame;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserGameRepository extends JpaRepository<UserGame,Long> {
    List<UserGame> findByUserChatId(long chatId);
    @Transactional

        // This method name will be automatically translated into the correct JPQL query
    int deleteByUserChatIdAndGame(long chatId, Game game);

}
