package com.pjg360.PJG360.model.entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "match_statistics")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MatchStatistics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "match_id", nullable = false)
    private Match match;

    private Double possession;
    private Integer totalShots;
    private Integer shotsOnTarget;
    private Integer yellowCards;
    private Integer redCards;
    private Integer corners;
}
