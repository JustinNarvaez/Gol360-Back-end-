package com.pjg360.PJG360.model.entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "stadiums")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Stadium {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Para Google Maps / OpenStreetMap
    private String mapsPlaceId;  // ID de Google Places
    private String address;       // Dirección completa

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String country;

    private Integer capacity;

    // Para integración con APIs de mapas
    private Double latitude;
    private Double longitude;
}
