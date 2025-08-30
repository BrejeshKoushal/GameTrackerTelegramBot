    package org.example.entity;

    import jakarta.persistence.*;
    import lombok.*;
    import lombok.extern.slf4j.Slf4j;

    import java.time.LocalDateTime;
    import java.util.HashSet;
    import java.util.Set;

    @AllArgsConstructor
    @Getter
    @Setter
    @Slf4j
    @NoArgsConstructor
    @Entity
    @Table(name = "user")
    public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Long id;

        @Column(name="chat_id")
        private Long chatId;

        @Column(name = "first_name")
        private String firstName;

        @Column(name = "password")
        private String password;

        @Column(name = "registered_at")
        private LocalDateTime registeredAt;

        @OneToMany(mappedBy = "user" , cascade = CascadeType.ALL, orphanRemoval = true)
        private Set<UserGame> gameTrackings = new HashSet<>();

    }

