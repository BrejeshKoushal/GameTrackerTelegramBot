package org.example.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Slf4j
@Entity
@Table(name = "game")
public class Game {

    @Column(name = "game_name")
    private String gameName;

    @Id
    @Column(name = "game_id")
    private Long gameId;

    @Column(name = "original_price")
    private BigDecimal originalPrice;

    @Column(name = "current_price")
    private BigDecimal currentPrice;

    @ManyToMany(mappedBy = "games")
    private Set<User> users = new HashSet<>();

}
