package com.pjg360.PJG360.model.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "teams")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Team {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(unique = true, length = 3)
    private String fifaCode;

    private String flagUrl;
    private String groupPhase;
    private String apiFootballId;

    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
    private List<Player> players;

    // Once defined, these are set by the coach
    @ManyToMany
    @JoinTable(
            name = "team_initial_eleven",
            joinColumns = @JoinColumn(name = "team_id"),
            inverseJoinColumns = @JoinColumn(name = "player_id")
    )
    private List<Player> initialEleven;
}
