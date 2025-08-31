package org.example.repository;

import org.example.entity.PriceAlert;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PriceAlertRepository extends JpaRepository<PriceAlert,Long> {
    List<PriceAlert> findByNotifiedFalse();
}
