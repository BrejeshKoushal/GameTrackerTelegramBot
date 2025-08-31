package org.example.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Slf4j
@Entity
@Table(name = "game")
public class Game {
    @Id
    @Column(name = "game_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gameId;

    @Column(name = "game_name")
    private String gameName;

    @Column(name = "steam_game_id")
    private String steamAppId;

    @Column(name = "epic_game_id")
    private String epicGameId;

    @Column(name= "original_price",precision = 10, scale = 2)
    private BigDecimal originalPrice;

    @Column(name = "current_price", precision = 10, scale = 2)
    private BigDecimal currentPrice;

    @OneToMany(mappedBy = "game")
    private Set<UserGame> userTracking = new HashSet<>();

}
