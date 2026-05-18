package com.pjg360.PJG360.model.entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "cities")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String country;

    // Para APIs de viajes (Amadeus, Booking, etc.)
    private String iataCode;
    private Double latitude;
    private Double longitude;
}
