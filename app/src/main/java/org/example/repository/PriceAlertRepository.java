package org.example.repository;

import jakarta.transaction.Transactional;
import org.example.entity.Game;
import org.example.entity.PriceAlert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;

    public interface PriceAlertRepository extends JpaRepository<PriceAlert,Long> {
        List<PriceAlert> findByNotifiedFalse();
        boolean existsByUser_ChatIdAndGameAndDesiredPrice(long chatId, Game game, BigDecimal desiredPrice);



}

