package com.pjg360.PJG360.model.entities;


import jakarta.persistence.*;
import lombok.*;

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

    // Para conectar con API-Football o la API oficial FIFA
    private String apiFootballId;  // ID en la API externa

    // Ej: "COL", "BRA" — útil para APIs externas de resultados
    @Column(unique = true, length = 3)
    private String fifaCode;

    private String flagUrl;
    private String groupPhase;
}
