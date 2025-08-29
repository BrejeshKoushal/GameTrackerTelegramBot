    package org.example.entity;

    import jakarta.persistence.*;
    import lombok.*;
    import lombok.extern.slf4j.Slf4j;

    import java.util.HashSet;
    import java.util.Set;

    @AllArgsConstructor
    @Getter
    @Setter
    @Builder
    @Slf4j
    @NoArgsConstructor
    @Entity
    @Table(name = "user")
    public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Long id;

        @Column(name = "password")
        private String password;

        @ManyToMany
        @JoinTable(
                name = "user_game",
                joinColumns = @JoinColumn(name="user_id"),
                inverseJoinColumns = @JoinColumn(name = "game_id")
        )
        private Set<Game> games = new HashSet<>();

    }

